package com.wanmi.demo.service;

import com.wanmi.demo.entity.User;
import com.wanmi.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(){
        User u=new User();
        u.setId(1);
        u.setName("zw");
        userRepository.save(u);
    }

    public List<User> getList(){
        return userRepository.findAll();
    }
}
