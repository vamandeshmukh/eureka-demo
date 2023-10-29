package com.merc.blog.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merc.blog.post.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
