package com.jratil.shardingdemo1.service;

import com.jratil.shardingdemo1.model.User;

import java.util.List;

/**
 * @author wenjunjun9
 * @created 2020/8/21 17:48
 * @description
 */
public interface UserService {

    List<User> findAll();

    User find(Integer id);

    List<User> findByName(String name);

    void addUser(User user);
}
