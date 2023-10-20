package com.example.boot3ssmstart.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot3ssmstart.bean.User;
import com.example.boot3ssmstart.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper,User> {
    
    @Autowired
    private UserMapper userMapper;
    public User getUserById(Long userId) {
        return userMapper.selectById(userId);
    }

    public List<User> getAllUsers() {
        return userMapper.selectList(null);
    }
    @Transactional
    public boolean saveUser(User user) {
        try {
            return userMapper.insert(user) > 0;
        } catch (Exception e) {
            // 添加异常处理逻辑，例如记录日志或抛出自定义异常
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateUserById(Long userId, User user) {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        // 设置更新的列
        wrapper.set("name",user.getName());
        wrapper.set("age",user.getAge());
        // 设置更新的条件
        wrapper.eq("id",userId);
        return userMapper.update(user,wrapper) > 0;
    }

    public boolean deleteUserById(Long userId) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda()
                        .eq(User::getId,userId);
        return userMapper.delete(wrapper) > 0;
    }
}
