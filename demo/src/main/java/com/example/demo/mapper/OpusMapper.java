package com.example.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.Vo.OpusVo;
import com.example.demo.pojo.Opus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface OpusMapper extends BaseMapper<Opus> {


    void addOpus(Opus opus);


    void addLabel(@Param("n") int n,@Param("int") Integer integer);


    List<OpusVo> getAllOpus(@Param("id") int id);

    void removeOpusLabel(int id);

    void setOpusState(int id, int state);

    List<OpusVo> getAllOpus();


    void setOpusCount(int id);
}
