package com.merc.blog.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merc.blog.user.expection.UserNotFoundException;
import com.merc.blog.user.model.User;
import com.merc.blog.user.repository.UserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public User userById(Integer userId) {
		// TODO Auto-generated method stub
		Optional<User> userOpt = userRepo.findById(userId);
		if (userOpt.isPresent()) {
			return userOpt.get();
		} else {
			String errorMessage = "User with userId: " + userId + " not found!";
			throw new UserNotFoundException(errorMessage);
		}
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

}
