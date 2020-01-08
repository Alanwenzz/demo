package com.wanmi.demo.controller;

import com.wanmi.demo.entity.User;
import com.wanmi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService  userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/add")
    public void add(){
        userService.add();
    }

    @RequestMapping("/getList")
    public List<User> getList(){
        return userService.getList();
    }
}
