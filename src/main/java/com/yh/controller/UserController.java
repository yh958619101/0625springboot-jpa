package com.yh.controller;

import com.yh.entuty.User;
import com.yh.repostory.UserRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
public class UserController {
    @Autowired
    UserRepostory userRepostory;
    @GetMapping("/user/{id}")
    public  User  getUser(@PathVariable("id") Integer id){
        User user = userRepostory.getOne(id);
        return  user;
    }
    @GetMapping("/user")
    public  User  insertUser(User user){
        User save = userRepostory.save(user);
        return  save;
    }
}
