package com.merc.blog.comment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.merc.blog.comment.model.Comment;
import com.merc.blog.comment.service.ICommentService;

@RestController
@CrossOrigin(origins = "*")
public class CommentController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ICommentService commentService;

	@GetMapping(path = "comments/{pid}", produces = "application/json")
	public ResponseEntity<List<Comment>> commentsByPostId(@PathVariable(name = "pid") Integer postId) {
		LOG.info(postId.toString());
		List<Comment> commentList = commentService.commentsByPostId(postId);

		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Comment>> response = new ResponseEntity<>(commentList, status);

		LOG.info("GET /comments - Comments for PostId: " + postId + " fetched");

		return response;
	}

	@PostMapping(path = "comments", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {

		Comment commentObj = commentService.addComment(comment);

		HttpStatus status = HttpStatus.CREATED;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Comment added successfully!");
		ResponseEntity<Comment> response = new ResponseEntity<Comment>(commentObj, headers, status);

		LOG.info("POST /- New Comment added");

		return response;
	}

}
