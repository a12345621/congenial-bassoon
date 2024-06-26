package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Vo.OpusVo;
import com.example.demo.Vo.userInfoVo;
import com.example.demo.mapper.OpusMapper;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.Opus;
import com.example.demo.service.OpusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OpusServiceImpl extends ServiceImpl<OpusMapper, Opus>
      implements OpusService {

    @Autowired
    private OpusMapper opusMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void addOpus(Opus opus) {
        opusMapper.addOpus(opus);
        int n=opus.getId();
        for (int i = 0; i < opus.getOpusLabelId().size(); i++) {
            opusMapper.addLabel(n,opus.getOpusLabelId().get(i));
        }

    }

    @Override
    public List<OpusVo> getAllOpus(int id) {
        return opusMapper.getAllOpus(id);
    }

    @Override
    public void removeOpusLabel(int id) {
        opusMapper.removeOpusLabel(id);
    }


    @Override
    public void setOpusState(int id, int state) {
        opusMapper.setOpusState(id,state);
    }

    @Override
    public List<userInfoVo> getAllOpusInfo() {
        return userInfoMapper.getAllOpusInfo();
    }

    @Override
    public List<OpusVo> getAllOpus() {
        return opusMapper.getAllOpus();
    }

    @Override
    public void setOpusCount(int id) {
        opusMapper.setOpusCount(id);
    }


}
