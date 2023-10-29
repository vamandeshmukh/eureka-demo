package com.merc.blog.comment.service;

import java.util.List;

import com.merc.blog.comment.model.Comment;

public interface ICommentService {

	public abstract Comment addComment(Comment comment);

	public abstract List<Comment> commentsByPostId(Integer postId);

}
