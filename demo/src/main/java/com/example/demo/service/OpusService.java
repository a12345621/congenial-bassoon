package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Vo.OpusVo;
import com.example.demo.Vo.userInfoVo;
import com.example.demo.pojo.Opus;

import java.util.List;

public interface OpusService extends IService<Opus> {

    /* 添加文章*/
    void addOpus(Opus opus);
    /* 返回全部用户文章*/
    List<OpusVo> getAllOpus(int id);
//    删除文章和标签之间的对应关系
    void removeOpusLabel(int id);
    //    set文章和状态
    void setOpusState(int id, int state);
    //  全部文章
    List<userInfoVo> getAllOpusInfo();

    List<OpusVo> getAllOpus();

    void setOpusCount(int id);
}
