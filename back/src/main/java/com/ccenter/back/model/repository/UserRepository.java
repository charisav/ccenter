package com.ccenter.back.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccenter.back.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
