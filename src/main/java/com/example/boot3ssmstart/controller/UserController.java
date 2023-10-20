package com.example.boot3ssmstart.controller;

import com.example.boot3ssmstart.bean.User;
import com.example.boot3ssmstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{userId}")
    public User getUserById(@PathVariable Long userId) {
        // 根据 userId 查询数据库，得到 user
        return userService.getUserById(userId);
    }

    @GetMapping(value ="/users")
    public List<User> getUsers() {
        // 查询全部用户得到列表 List
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        // 调用 Service 层保存 user
        userService.saveUser(user);
    }

    @PutMapping(value = "/user/{userId}")
    public void updateUser(@PathVariable Long userId, @RequestBody User user) {
        // 调用 Service 层更新 user
        userService.updateUserById(userId, user);
    }

    @DeleteMapping(value = "/user/{userId}")
    public void deleteUserById(@PathVariable Long userId) {
        // 调用 Service 层根据 userId 删除 user
        userService.deleteUserById(userId);
    }
}
