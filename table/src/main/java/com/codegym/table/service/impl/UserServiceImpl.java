package com.codegym.table.service.impl;

import com.codegym.table.entity.User;
import com.codegym.table.repository.UserRepository;
import com.codegym.table.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        List<User> userList =(List<User>) userRepository.findAll();
        return userList;
    }

    @Override
    public User getById(long id) {
        User user = userRepository.findById(id).orElse(new User());
        return user;
    }

}
