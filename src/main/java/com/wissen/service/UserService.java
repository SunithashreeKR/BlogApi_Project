package com.wissen.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.wissen.dto.UserDto;
import com.wissen.entity.User;
import com.wissen.response.UserResponse;


public interface UserService {

	//UserResponse userResponse(UserDto userDto);

	List<User> userResponse();

	User userResponse(Integer id);

	UserResponse userResponse(@Valid UserDto userDto);

	void deletebyId(Integer id);



	

}
