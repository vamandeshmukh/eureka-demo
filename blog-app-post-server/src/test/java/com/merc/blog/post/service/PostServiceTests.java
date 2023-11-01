package com.merc.blog.post.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostServiceTests {

	@Autowired
	private PostService postService;

	@Test
	void allPostsTest() {
		assertEquals(postService.allPosts().size(), 2);
	}

}
