package com.example.demo.service.impl;

import com.example.demo.Vo.UserVo;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.mapper.UserMapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
class UserServiceImplTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Test
    public void ttttt(){
        List<UserVo> allUserInfo = userInfoMapper.getAllUserInfo();
        System.out.println(allUserInfo);
    }


}