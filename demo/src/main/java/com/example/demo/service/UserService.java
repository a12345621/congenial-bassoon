package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Vo.UserVo;
import com.example.demo.pojo.User;

import java.util.List;

public interface UserService extends IService<User> {

    


    int insertUser(User user);

    UserVo SelectUserInfo(User user);
}
