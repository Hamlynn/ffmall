package com.cqudu.fmmall.service;

import com.cquedu.fmmall.vo.ResultVO;


public interface IUserService {
    public ResultVO checkLogin(String name, String pwd);

}
