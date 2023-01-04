package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.user.domain.User;


public interface UserRepository extends JpaRepository<User, String>, QuerydslPredicateExecutor<User>{

	User findByIdAndPasswd(String userId, String passwd);
}
