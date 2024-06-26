package com.example.demo.controller;


import com.example.demo.Vo.UserVo;
import com.example.demo.config.MinioProperties;
import com.example.demo.pojo.UserInfo;
import com.example.demo.result.Result;
import com.example.demo.service.FileService;
import com.example.demo.service.UserInfoService;
import io.minio.errors.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userinfo")
@CrossOrigin(origins = "*")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private FileService fileService;

//    根据id查询一个用户
    @GetMapping("/getUserInfo")
    @CrossOrigin(origins = "*")
    public Result getUserInfo(@RequestParam int id ) {
        UserInfo list = userInfoService.getUserInfo(id);
        return Result.ok(list);
    }
//  修改用户信息
    @PostMapping("/updateUserInfo")
    @CrossOrigin(origins = "*")
    public Result updateUserInfo(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo);
        userInfoService.updateUserInfo(userInfo);
        return Result.ok();
    }

//    获取全部用户信息
    @GetMapping("/getAllUserInfo")
    @CrossOrigin(origins = "*")
    public Result<List<UserVo>> getAllUserInfo(){
        List<UserVo> list = userInfoService.getAllUserInfo();
        System.out.println(list);
        return Result.ok(list);
    }
    //修改用户状态
    @GetMapping("/updateUserState")
    @CrossOrigin(origins = "*")
    public Result updateUserState(@RequestParam Integer id,@RequestParam Integer state){
        System.out.println(id);
        userInfoService.updateUserState(id,state);
        System.out.println(state);
        return Result.ok();
    }

    @PostMapping("/updateUserImage")
    @CrossOrigin(origins = "*")
    public Result updateUserImage(MultipartFile file,int id) throws Exception {
        if (file==null){
            return Result.ok();
        }
        String url = fileService.upload(file);
        userInfoService.updateUserImage(url,id);
        return Result.ok();
    }

}
