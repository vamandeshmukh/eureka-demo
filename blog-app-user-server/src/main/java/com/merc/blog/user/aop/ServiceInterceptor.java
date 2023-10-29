package com.merc.blog.user.aop;

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

	@Before("execution(* com.merc.blog.user.service.UserService.userById(..))")
	public void serviceLog() {
		LOG.info("Intercept before /- User fetched successfully.");
	}

	@After("execution(* com.merc.blog.user.service.UserService.addUser(..))")
	public void controllerLog() {
		LOG.info("Intercept after /- New User added.");
	}
	
	@AfterThrowing("execution(* com.merc.blog.user.service.UserService.userById(..))")
	public void exceptionThrown(JoinPoint obj) {
			LOG.error(obj.getSignature().toString());
	}

}
