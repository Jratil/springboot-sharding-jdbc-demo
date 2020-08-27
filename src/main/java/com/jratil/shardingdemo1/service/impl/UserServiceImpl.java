package com.jratil.shardingdemo1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.jratil.shardingdemo1.mapper.UserMapper;
import com.jratil.shardingdemo1.model.User;
import com.jratil.shardingdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wenjunjun9
 * @created 2020/8/21 17:49
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        return users;
    }

    @Override
    public User find(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }

    @Override
    public List<User> findByName(String name) {
        List<User> user = userMapper.selectList(Wrappers.<User>lambdaQuery().eq(User::getName, name));
        return user;
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }
}
