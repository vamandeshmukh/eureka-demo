package com.merc.blog.post.service;

import java.util.List;

import com.merc.blog.post.model.Post;

public interface IPostService {

	public abstract List<Post> allPosts();
	
	public abstract Post postById(Integer id);

	public abstract Post addPost(Post post);

	public abstract String deletePost(Integer id);

}
