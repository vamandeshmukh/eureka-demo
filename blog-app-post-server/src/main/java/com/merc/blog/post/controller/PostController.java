package com.merc.blog.post.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.merc.blog.post.model.Post;
import com.merc.blog.post.service.IPostService;

@RestController
@CrossOrigin(origins = "*")
public class PostController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IPostService postService;
	
	@GetMapping (path = "posts", produces = "application/json" )
	public ResponseEntity<List<Post>> allPosts() {
		
		List<Post> postList = postService.allPosts();
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Post>> response = new ResponseEntity<List<Post>>(postList, status);
		
		return response;
	}
	
	@GetMapping(path = "posts/{id}", produces = "application/json")
	public ResponseEntity<Post> postById(@PathVariable (name = "id") Integer id) {
		
		Post postObj = postService.postById(id);
		
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Post found successfully.");
		ResponseEntity<Post> response = new ResponseEntity<Post>(postObj, headers, status);
		
		LOG.info("GET /- Post with postId: " + id +" found");
		
		return response;
	}
	
	@PostMapping(path = "posts", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Post> addPost(@RequestBody Post post) {
		
		Post postObj = postService.addPost(post);
		
		HttpStatus status = HttpStatus.CREATED;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Post uploaded successfully!");
		ResponseEntity<Post> response = new ResponseEntity<Post>(postObj, headers, status);
		
		return response;
	}
	
	@DeleteMapping(path = "posts/{id}")
	public ResponseEntity<String> deletePost(@PathVariable (name = "id") Integer id) {
		
		String message = postService.deletePost(id);
		
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Post deleted successfully.");
		ResponseEntity<String> response = new ResponseEntity<String>(message, headers, status);
		
		LOG.info("DELETE /- Post with postId: " + id + " deleted");
		
		return response;
	}

}
