package com.wissen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wissen.dto.PostDto;
import com.wissen.entity.PostEntity;
import com.wissen.response.PostResponse;

@Service
public interface PostService {


	PostResponse postResponse(PostDto poDto);

	

	List<PostEntity> postResponse();



	Optional<PostEntity> getById(Integer id);

}
