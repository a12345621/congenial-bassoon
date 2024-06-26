package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.LabelMapper;
import com.example.demo.pojo.Label;
import com.example.demo.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label>
        implements LabelService {

    @Autowired
    private LabelMapper labelMapper;

    @Override
    public void addLabel(String labelName) {
        labelMapper.addLabel(labelName);
    }
}
