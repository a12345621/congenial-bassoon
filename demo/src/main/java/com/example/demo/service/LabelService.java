package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.Label;

public interface LabelService extends IService<Label> {

    void addLabel(String labelName);
}
