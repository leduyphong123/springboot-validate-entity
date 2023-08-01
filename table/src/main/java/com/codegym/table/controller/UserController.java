package com.codegym.table.controller;

import com.codegym.table.entity.User;
import com.codegym.table.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ModelAndView getAll(){
        List<User> userList = userService.getAll();
        return new ModelAndView("index","userList",userList);
    }
    @GetMapping("/id")
    public ModelAndView getById(){
        long id  = 1;
        User user = userService.getById(id);
        return new ModelAndView("index","user",user);
    }
}
