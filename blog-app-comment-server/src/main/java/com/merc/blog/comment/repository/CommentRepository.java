package com.merc.blog.comment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merc.blog.comment.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{
	
	public abstract List<Comment> findByPostId(Integer postId);

}
