package com.cqudu.fmmall.service.impl;


import com.cqudu.fmmall.service.UserService;
import com.cquedu.fmmall.dao.UserDAO;
import com.cquedu.fmmall.entity.User;
import com.cquedu.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//service注解使之被spring管理

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;


    @Override
    public ResultVO checkLogin(String name, String pwd){
        //    1.根据账号查询用户信息
       User user= userDAO.queryUserByName(name);
//      2. 判断
       if(user==null){
           //用户名不存在

           return new ResultVO(100001,"用户名不存在","null");
       } else {
           //3. 对输入密码进行判断
           //使用加密后的密码和user中的密码进行匹配
           if(user.getU_Password().equals(pwd)){
                //验证成功
               return new ResultVO(10000,"登录成功",user);

           }
           else{
               //验证失败:用户名或密码错误
               return new ResultVO(10001,"密码错误",user);
           }
       }

    }


}
