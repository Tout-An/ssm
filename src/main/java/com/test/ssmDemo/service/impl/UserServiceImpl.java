package com.test.ssmDemo.service.impl;

import com.test.ssmDemo.mapper.UserMapper;
import com.test.ssmDemo.model.User;
import com.test.ssmDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;

  @Override
  public List<User> getUserList() {
    return userMapper.selectUserList();
  }
}
