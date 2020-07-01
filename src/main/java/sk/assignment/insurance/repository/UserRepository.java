package sk.assignment.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sk.assignment.insurance.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
