package com.example.boot3ssmstart.service;

import com.example.boot3ssmstart.bean.User;
import com.example.boot3ssmstart.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    private UserMapper userMapper;
    public User getUserById(Long userId) {
        return userMapper.getUserById(userId);
    }

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    public void updateUserById(Long userId, User user) {
        userMapper.updateUserById(userId, user);
    }

    public void deleteUserById(Long userId) {
        userMapper.deleteUserById(userId);
    }
}
