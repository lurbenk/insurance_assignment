package sk.assignment.insurance.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.assignment.insurance.model.User;
import sk.assignment.insurance.model.UserWithoutContracts;
import sk.assignment.insurance.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/insured")
	public List<UserWithoutContracts> retrieveAllUsers() {
		return userService.getAllUsersWithoutContracts();
	}
	
	@GetMapping("/insured/{id}")
	public User retrieveUserDetail(@PathVariable int id) {
		return userService.getUserDetail(id);
	}
	
	@PostMapping("/insured")
	public Integer createUser(@Valid @RequestBody User user) {
		return userService.postNewUserWithContracts(user);
	}
}
