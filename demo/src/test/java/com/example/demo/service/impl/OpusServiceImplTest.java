package com.example.demo.service.impl;

import com.example.demo.Vo.OpusVo;
import com.example.demo.mapper.OpusMapper;
import com.example.demo.pojo.Opus;
import com.example.demo.service.OpusService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpusServiceImplTest {

    @Autowired
    private OpusMapper opusMapper;
    @Autowired
    private OpusService opusService;
    @Test
    public void stttt(){
        List<OpusVo> list=opusService.getAllOpus();
        System.out.println(list);
    }
}