package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
* 用户信息
* @TableName userinfo
*/
//@Entity
@Table(name = "user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    /**
    * 用户信息id
    */
//    @Id
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

}
