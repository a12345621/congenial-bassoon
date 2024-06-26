package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Vo.UserVo;
import com.example.demo.pojo.UserInfo;

import java.util.List;

public interface UserInfoService extends IService<UserInfo> {

    UserInfo getUserInfo(Integer id);

    int updateUserInfo(UserInfo userInfo);

    List<UserVo> getAllUserInfo();

    void updateUserState(Integer id, Integer state);

    void updateUserImage(String url,int id);
}
