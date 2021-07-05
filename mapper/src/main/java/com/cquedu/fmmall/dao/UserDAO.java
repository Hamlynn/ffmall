package com.cquedu.fmmall.dao;

import com.cquedu.fmmall.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    public User queryUserByName(String name);

}
