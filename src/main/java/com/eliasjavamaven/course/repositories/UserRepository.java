package com.eliasjavamaven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliasjavamaven.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
