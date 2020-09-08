package com.test.project.service;

import java.util.List;

import com.test.project.entity.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
}