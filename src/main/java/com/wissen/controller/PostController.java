package com.wissen.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.dto.PostDto;
import com.wissen.entity.PostEntity;
import com.wissen.response.PostResponse;
import com.wissen.service.PostService;

@RestController
@RequestMapping("/u2")
public class PostController {

	
	@Autowired
	PostService postService;
	
	@PostMapping("/add")
	public PostResponse postResponse(@RequestBody PostDto poDto)
	{
		return postService.postResponse(poDto);
    }
	
	@GetMapping("/getAllDetails")
	public List<PostEntity> postResponse()
	{
		return postService.postResponse();
		
	}
	
	@GetMapping("/getById/{id}")
	public Optional<PostEntity> postResponse(@PathVariable Integer id)
	{
		return postService.getById(id);
		
	}
}
