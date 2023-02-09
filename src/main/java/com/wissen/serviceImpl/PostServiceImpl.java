package com.wissen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.dto.PostDto;
import com.wissen.entity.PostEntity;
import com.wissen.repository.PostRepository;
import com.wissen.response.PostResponse;
import com.wissen.service.PostService;

@Service
public class PostServiceImpl implements PostService{


	@Autowired
	PostRepository postRepository;

	@Override
	public PostResponse postResponse(PostDto poDto) {
		Optional<PostEntity> data = postRepository.findByUsername(poDto.getUsername());

		if(!data.isPresent())
		{
			PostEntity post = new PostEntity();

			post.setUsername(poDto.getUsername());
			post.setTitle(poDto.getTitle());
			post.setUpdatedOn(poDto.getUpdatedOn());
			post.setCreatedOn(poDto.getCreatedOn());
			post.setContent(poDto.getContent());

			postRepository.save(post);

		}

		PostEntity post = data.get();
		post.setUsername(poDto.getUsername());
		post.setTitle(poDto.getTitle());
		post.setUpdatedOn(poDto.getUpdatedOn());
		post.setCreatedOn(poDto.getCreatedOn());
		post.setContent(poDto.getContent());

		postRepository.save(post);

		PostResponse postResponse = new PostResponse();

		postResponse.setStatus("200");
		postResponse.setMessage("Data is successfully retrived");
		postResponse.setUsername(poDto.getUsername());
		postResponse.setTitle(poDto.getTitle());
		postResponse.setUpdatedOn(poDto.getUpdatedOn());
		postResponse.setCreatedOn(poDto.getCreatedOn());
		postResponse.setContent(poDto.getContent());

		return postResponse;
	}

	@Override
	public List<PostEntity> postResponse()
	{
		return postRepository.findAll();
	}

	@Override
	public Optional<PostEntity> getById(Integer id) {

		return postRepository.findById(id);
			
	}





}
