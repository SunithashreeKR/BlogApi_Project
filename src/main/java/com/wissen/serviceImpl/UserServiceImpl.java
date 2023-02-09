package com.wissen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.dto.UserDto;
import com.wissen.entity.User;
import com.wissen.exception.UserNotFoundException;
import com.wissen.repository.UserRepository;
import com.wissen.response.UserResponse;
import com.wissen.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserResponse userResponse(UserDto userDto) {

		Optional<User> data = userRepository.findByUsername(userDto.getUsername()); // Updating the data by username
	
		
		if (!data.isPresent()) {
			User user = new User();
			user.setUsername(userDto.getUsername());
			user.setEmailaddress(userDto.getEmailaddress());
			user.setPassword(userDto.getPassword());
			user.setAddress(userDto.getAddress());

			userRepository.save(user);

		} 
		
		//for update
		else if (data.isPresent()) {

			User user = data.get();
			user.setUsername(userDto.getUsername());
			user.setEmailaddress(userDto.getEmailaddress());
			user.setPassword(userDto.getPassword());
			user.setAddress(userDto.getAddress());

			userRepository.save(user);
		}
		UserResponse userresponse = new UserResponse();
		userresponse.setStatus("200");
		userresponse.setMessage("Data is successfully retrived");
		userresponse.setUsername(userDto.getUsername());
		userresponse.setEmailaddress(userDto.getEmailaddress());
		userresponse.setPassword(userDto.getPassword());
		userresponse.setAddress(userDto.getAddress());

		return userresponse;
	}

	@Override
	public List<User> userResponse() {

		return userRepository.findAll();
	}

	@Override
	public User userResponse(Integer id) {

		User user = userRepository.findById(id).get();
		if (user == null) {
			throw new UserNotFoundException("User not found with id " + id);
		} else {
			return user;
		}
	}

	@Override
	public void deletebyId(Integer id) {

		userRepository.deleteById(id); 
	}

}
