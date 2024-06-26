package com.example.demo.Vo;

import com.example.demo.pojo.Label;
import com.example.demo.pojo.Opus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userInfoVo {

    /**
     * 用户信息id
     */
    private Integer id;
    /**
     * 关联用户账号密码主键
     */

    private Integer userId;
    /**
     * 用户名
     */

    private String userinfoUsername;
    /**
     * 个人简介
     */
    private String userinfoBiography;
    /**
     * 头像
     */
    private String userinfoImage;
    /**
     * 用户性别
     */
    private String userinfoGender;
    /**
     * 用户年龄
     */
    private Long userinfoAge;
    /**
     * 用户注册时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd", timezone = "GMT+8")
    private Date userinfoRegistrationTime;
    /*
     * 用户状态
     * */
    private int userinfoState;

    private List<OpusVo> opusVoList;

    private List<Label> labelList;
}
