package com.cquedu.fmmall.controller;
import com.cqudu.fmmall.service.UserService;
import com.cquedu.fmmall.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public ResultVO login(String name,String pwd){
        return  userService.checkLogin(name,pwd);
    }

}
