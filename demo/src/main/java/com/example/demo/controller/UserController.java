package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Vo.UserVo;
import com.example.demo.pojo.User;
import com.example.demo.result.Result;
import com.example.demo.result.ResultCodeEnum;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private final UserService userService;

    @GetMapping
    @CrossOrigin(origins = "*")
    public Result getUsers() {
        List<User> list = userService.list();
        return Result.ok(list);
    }
    //登录判断
    @PostMapping("/get")
    @CrossOrigin(origins = "*")
    public Result SelectUser(@RequestBody User user) {
        if (user.getUsername().isEmpty() || user.getPassword().isEmpty()){
            return Result.build(null,ResultCodeEnum.APP_ACCOUNT_ERROR);
        }
        UserVo list =  userService.SelectUserInfo(user);
        if (list==null ){
            return Result.build(null,ResultCodeEnum.ADMIN_ACCOUNT_ERROR);
        }
        if (list.getUserInfo().getUserinfoState()==2){
            return Result.build(null,ResultCodeEnum.APP_ACCOUNT_DISABLED_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",user.getUsername());
        List<User> list1 = userService.list(queryWrapper);
        return Result.ok(list1);
    }
    //新增用户
    @PostMapping("/insert")
    @CrossOrigin(origins = "*")
    public Result insertUser(@RequestBody User user) {
        if (user.getUsername().isEmpty() ||user.getPassword().isEmpty()){
            return Result.build(null,ResultCodeEnum.APP_ACCOUNT_ERROR);
        }
        int n = userService.insertUser(user);
        if (n == 1) {
            return Result.build(null,ResultCodeEnum.ADMIN_ACCOUNT_EXIST_ERROR);
        }
        return Result.ok();
    }
}
