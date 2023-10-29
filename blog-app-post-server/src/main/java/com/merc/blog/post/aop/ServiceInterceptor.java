package com.merc.blog.post.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class ServiceInterceptor {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.merc.blog.post.service.PostService.allPosts(..))")
	public void serviceLog() {
		LOG.info("Intercept before /- All posts fetched.");
	}

	@After("execution(* com.merc.blog.post.controller.PostController.addPost(..))")
	public void controllerLog() {
		LOG.info("Intercept after /- New post added");
	}
	
	@AfterThrowing("execution(* com.merc.blog.post.service.PostService.postById(..))")
	public void exceptionThrown(JoinPoint obj) {
			LOG.error(obj.getSignature().toString());
	}

}
