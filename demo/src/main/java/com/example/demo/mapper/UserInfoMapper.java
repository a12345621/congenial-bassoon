package com.example.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.Vo.UserVo;
import com.example.demo.Vo.userInfoVo;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    void insertUserId(@Param("sn") String username);

    int updateUserInfo(@Param("ui")UserInfo userInfo);

    Integer SelectUserInfo(@Param("u")User user);

    List<UserVo> getAllUserInfo();

    void updateUserState(@Param("id") Integer id,@Param("st") Integer state);

    void updateUserImage(String url, int id);

    List<userInfoVo> getAllOpusInfo();
}
