package com.codegym.table.service;

import com.codegym.table.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAll();

    User getById(long id);
}
