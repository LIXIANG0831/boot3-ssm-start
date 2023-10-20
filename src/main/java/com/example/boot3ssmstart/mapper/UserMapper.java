package com.example.boot3ssmstart.mapper;


import com.example.boot3ssmstart.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {
    public User getUserById(@Param("id") Long userId);

    List<User> getAllUsers();

    void saveUser(@Param("user") User user);

    void updateUserById(@Param("userId") Long userId,@Param("user") User user);

    void deleteUserById(@Param("id") Long userId);
}
