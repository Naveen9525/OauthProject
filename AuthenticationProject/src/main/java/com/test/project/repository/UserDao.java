package com.test.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.project.entity.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer>
{

	User findByUsername(String username);

}
