package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.pojo.Label;
import com.example.demo.result.Result;
import com.example.demo.service.LabelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/label")
@CrossOrigin(origins = "*")
public class LabelController {

    @Autowired
    private LabelService labelService;

    //获取所有文章标签
    @GetMapping("/all")
    @CrossOrigin(origins = "*")
    public Result getListAllLabel() {
        List<Label> list = labelService.list();
        return Result.ok(list);
    }

    //删除文章标签
    @GetMapping("/remove")
    @CrossOrigin(origins = "*")
    public Result removeLabel(@RequestParam("id") Integer id) {
        QueryWrapper<Label> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        labelService.remove(queryWrapper);
        List<Label> list = labelService.list();
        return Result.ok(list);
    }

    //添加文章标签
    @GetMapping("/add")
    @CrossOrigin(origins = "*")
    public Result addLabel(@RequestParam("newLabel") String labelName) {
        labelService.addLabel(labelName);
        List<Label> list = labelService.list();
        return Result.ok(list);
    }

}
