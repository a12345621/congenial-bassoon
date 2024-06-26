package com.example.demo.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Vo.UserVo;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

//add用户
    @Override
    public int insertUser(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        List<User> list = userMapper.selectList(queryWrapper);
        if (list.size()==1) {
            return 1;
        }else {
            userMapper.insertUser(user);
            userInfoMapper.insertUserId(user.getUsername());
            return 0;
        }
    }

    @Override
    public UserVo SelectUserInfo(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        queryWrapper.eq("password", user.getPassword());
        List<User> list = userMapper.selectList(queryWrapper);
        if (list==null|| list.isEmpty()) {
            return null;
        }
        Integer i = userInfoMapper.SelectUserInfo(user);
        UserVo userVo = new UserVo();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserinfoState(i);
        userVo.setUserInfo(userInfo);
        return userVo;
    }

}
