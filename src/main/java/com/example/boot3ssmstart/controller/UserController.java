package com.example.boot3ssmstart.controller;

import com.example.boot3ssmstart.bean.User;
import com.example.boot3ssmstart.service.UserService;
import com.example.boot3ssmstart.util.Response;
import com.example.boot3ssmstart.util.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{userId}")
    public Response<Object> getUserById(@PathVariable Long userId) {
        // 根据 userId 查询数据库，得到 user
        User data = userService.getUserById(userId);
        return new Response<>(StateCode.SUCCESS.getCode(), StateCode.SUCCESS.getMessage(), data);
    }

    @GetMapping(value ="/users")
    public Response<Object> getUsers() {
        // 查询全部用户得到列表 List
        List<User> data = userService.getAllUsers();
        return new Response<>(StateCode.SUCCESS.getCode(), StateCode.SUCCESS.getMessage(), data);
    }

    @PostMapping("/user")
    public Response<Object> saveUser(@RequestBody User user) {
        // 调用 Service 层保存 user
        boolean data = userService.saveUser(user);
        return new Response<>(StateCode.SUCCESS.getCode(), StateCode.SUCCESS.getMessage(), data);
    }

    @PutMapping(value = "/user/{userId}")
    public Response<Object> updateUser(@PathVariable Long userId, @RequestBody User user) {
        // 调用 Service 层更新 user
        boolean data = userService.updateUserById(userId, user);
        return new Response<>(StateCode.SUCCESS.getCode(), StateCode.SUCCESS.getMessage(), data);
    }

    @DeleteMapping(value = "/user/{userId}")
    public Response<Object> deleteUserById(@PathVariable Long userId) {
        // 调用 Service 层根据 userId 删除 user
        boolean data = userService.deleteUserById(userId);
        return new Response<>(StateCode.SUCCESS.getCode(), StateCode.SUCCESS.getMessage(), data);
    }
}
