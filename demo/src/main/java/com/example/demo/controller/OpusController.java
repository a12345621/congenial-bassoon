package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Vo.OpusVo;
import com.example.demo.Vo.userInfoVo;
import com.example.demo.pojo.Opus;
import com.example.demo.result.Result;
import com.example.demo.service.OpusService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/opus")
@CrossOrigin(origins = "*")
public class OpusController {
    @Autowired
    private OpusService opusService;

    //添加文章
    @PostMapping("/add")
    @CrossOrigin(origins = "*")
    public Result addOpus(@RequestBody Opus opus) {
        System.out.println(opus);
        opusService.addOpus(opus);
        return Result.ok();
    }
    //返回用户的所有文章
    @GetMapping("/getAll")
    @CrossOrigin(origins = "*")
    public Result<List<OpusVo>> getAllOpus(@RequestParam int id) {
        List<OpusVo> list=opusService.getAllOpus(id);
        System.out.println(list);
        return Result.ok(list);
    }
    //删除文章
    @GetMapping("/del")
    @CrossOrigin(origins = "*")
    public Result removeOpus(@RequestParam int id) {
        opusService.removeById(id);
        opusService.removeOpusLabel(id);
        return Result.ok();
    }
    //主页所有文章
    @GetMapping("/getAllOpus")
    @CrossOrigin(origins = "*")
    public Result<List<userInfoVo>> getAllOpusInfo(){

        List<userInfoVo> list=opusService.getAllOpusInfo();
        return Result.ok(list);
    }
    //修改文章状态

    @GetMapping("/setOpusState")
    @CrossOrigin(origins = "*")
    public Result setOpusState(@RequestParam int id,@RequestParam int state) {
        System.out.println(id);
        opusService.setOpusState(id,state);
        return Result.ok();
    }
    //管理员所有文章
    @GetMapping("/getAllOpusRoot")
    @CrossOrigin(origins = "*")
    public Result<List<OpusVo>> getAllOpus(){
        List<OpusVo> list=opusService.getAllOpus();
        return Result.ok(list);
    }

    @GetMapping("/setOpusCount")
    @CrossOrigin(origins = "*")
    public Result<List<OpusVo>> setOpusCount(@RequestParam int id){
        opusService.setOpusCount(id);
        return Result.ok();
    }

}
