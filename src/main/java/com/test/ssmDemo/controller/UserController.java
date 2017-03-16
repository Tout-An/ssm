package com.test.ssmDemo.controller;

import com.test.ssmDemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
  @Autowired
  private UserService userService;

  public static final Logger logger;

  static {
    logger = LoggerFactory.getLogger(UserController.class);
  }

  @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
  public void getUserList() {
    logger.info(userService.getUserList().toString());
  }
}
