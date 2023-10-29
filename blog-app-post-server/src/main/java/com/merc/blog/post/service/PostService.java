package com.merc.blog.post.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merc.blog.post.exception.PostNotFoundException;
import com.merc.blog.post.model.Post;
import com.merc.blog.post.repository.PostRepository;

@Service
public class PostService implements IPostService {
	
	@Autowired
	PostRepository postRepo;
	
	@Override
	public List<Post> allPosts() {
		// TODO Auto-generated method stub
		return postRepo.findAll();
	}

	@Override
	public Post postById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Post> postOpt = postRepo.findById(id);
		if (postOpt.isPresent()) {
			return postOpt.get();
		} else {
			String errorMessage = "Post with postId " + id + " not found!";
			throw new PostNotFoundException(errorMessage);
		}
	}
	
	@Override
	public Post addPost(Post post) {
		// TODO Auto-generated method stub
		return postRepo.save(post);
	}

	@Override
	public String deletePost(Integer id) {
		// TODO Auto-generated method stub
		postRepo.deleteById(id);
		return "Post deleted successfully!";
	}

}
