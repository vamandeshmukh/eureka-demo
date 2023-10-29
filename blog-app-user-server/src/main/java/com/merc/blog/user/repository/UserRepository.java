package com.merc.blog.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merc.blog.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
