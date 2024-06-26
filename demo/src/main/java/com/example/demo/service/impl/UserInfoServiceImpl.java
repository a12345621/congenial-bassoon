package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Vo.UserVo;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.pojo.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
        implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(Integer id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public int updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateUserInfo(userInfo);
    }

    @Override
    public List<UserVo> getAllUserInfo() {
        return userInfoMapper.getAllUserInfo();
    }

    @Override
    public void updateUserState(Integer id, Integer state) {
        userInfoMapper.updateUserState(id,state);
    }

    @Override
    public void updateUserImage(String url,int id) {

        userInfoMapper.updateUserImage(url,id);
    }
}
