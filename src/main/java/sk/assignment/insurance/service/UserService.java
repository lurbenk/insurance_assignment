package sk.assignment.insurance.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import sk.assignment.insurance.exception.BadRequestException;
import sk.assignment.insurance.exception.UserNotFoundException;
import sk.assignment.insurance.model.User;
import sk.assignment.insurance.model.UserWithoutContracts;
import sk.assignment.insurance.repository.UserRepository;
import sk.assignment.insurance.validation.ContractValidator;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ContractValidator contractValidator;
	
	public List<UserWithoutContracts> getAllUsersWithoutContracts() {
		List<User> sortedUsers =  userRepository.findAll(Sort.by(Sort.Direction.ASC, "lastName"));
		List<UserWithoutContracts> returningUsers = new ArrayList<>();
		for (User user: sortedUsers) {
			returningUsers.add(new UserWithoutContracts(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getBirthNumber(), user.getPermanentResidenceAddress(), user.getMailingAddress()));
		}
		return returningUsers;
	}
	
	public User getUserDetail(int id) {
		Optional<User> user =  userRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException("id-"+ id);
		}
		return user.get();
	}
	
	public Integer postNewUserWithContracts(User user) {
		if (!contractValidator.validateUserRequest(user)) {
			throw new BadRequestException();
		}
		if(user.getMailingAddress() == null) {
			user.setMailingAddress(user.getPermanentResidenceAddress());
		}
		User savedUser = userRepository.save(user);
		return savedUser.getId();
	}
}
