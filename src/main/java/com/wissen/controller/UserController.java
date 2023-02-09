package com.wissen.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.dto.UserDto;
import com.wissen.entity.User;
import com.wissen.response.UserResponse;
import com.wissen.service.UserService;

@RestController //It is a combination of @controller and @requestbody all the methods returns the json response
@RequestMapping("/u1")  //This is starting end points in postmon
public class UserController {

	Logger logger= LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/Message")
	public String index() {
		logger.trace("Trassing a message");
//		logger.debug("Debuging");
//		logger.info("A Info");
		logger.error("A error message");
//		logger.warn("A warn message");
		
		return "Tracing the error" ;
	}
	
	@Autowired
	UserService userService;
	
	@PostMapping("/add")  
	public ResponseEntity<UserResponse> userResponse(@Valid @RequestBody UserDto userDto)
	{
		UserResponse savedUser = userService.userResponse(userDto);
		
		return new  ResponseEntity<UserResponse>(savedUser,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/getAllDetails")
	public List<User> userResponse()
	{
		return userService.userResponse();
	}
	
	@GetMapping("/getById/{id}")
	public User userResponse(@PathVariable Integer id)
	{
		return userService.userResponse(id);
			
	}

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Void> deletebyId(@PathVariable Integer id)
    {
    userService.deletebyId(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		
    	
    }
}
