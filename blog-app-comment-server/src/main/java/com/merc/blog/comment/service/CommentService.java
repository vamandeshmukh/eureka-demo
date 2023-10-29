package com.merc.blog.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merc.blog.comment.model.Comment;
import com.merc.blog.comment.repository.CommentRepository;

@Service
public class CommentService implements ICommentService {
	
	@Autowired
	CommentRepository commentRepo;
	
	@Override
	public List<Comment> commentsByPostId(Integer postId) {
		// TODO Auto-generated method stub
		return commentRepo.findByPostId(postId);
	}
	
	@Override
	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentRepo.save(comment);
	}

}
