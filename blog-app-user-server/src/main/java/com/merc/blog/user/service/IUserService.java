package com.merc.blog.user.service;

import com.merc.blog.user.model.User;

public interface IUserService {

	public abstract User userById(Integer userId);

	public abstract User addUser(User user);

}
