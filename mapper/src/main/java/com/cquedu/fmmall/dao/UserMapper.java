package com.cquedu.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cquedu.fmmall.entity.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserDAO extends BaseMapper<User> {
    public User queryUserByName(String name);

}
