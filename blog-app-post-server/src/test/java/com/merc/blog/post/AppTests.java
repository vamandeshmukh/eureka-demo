package com.merc.blog.post;

//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppTests {

//	@Test
//	void contextLoads() {
//	}

	// positive test case 
	@Test
	public void testTest() {
		int expected = 10;
		int actual = 5 + 5;
//		Assertions.assertEquals(expected, actual);
		assertEquals(expected, actual);
	}

	// negative test case 
	@Test
	public void testTestN() {
		int unexpected = 10;
		int actual = 6 + 5;
		assertNotEquals(unexpected, actual);
	}
}
