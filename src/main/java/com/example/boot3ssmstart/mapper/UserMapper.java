package com.example.boot3ssmstart.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boot3ssmstart.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
