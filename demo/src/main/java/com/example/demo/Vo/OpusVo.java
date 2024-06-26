package com.example.demo.Vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo.pojo.Label;
import com.example.demo.pojo.Opus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;


@Data
public class OpusVo {

    /**
     * 主键
     */
    @TableId
    private Integer id;
    /**
     * 关联用户主键
     */

    private Integer opusUserid;
    /**
     * 文章标题
     */
    private String opusTitle;

    /**
     * 文章主要内容
     */

    private String opusText;
    /**
     * 管理员审核状态(1,待审核2，违规3，通过审核)
     */

    private Integer opusState;
    /**
     * 文章发布时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd", timezone = "GMT+8")
    private Date opusPublish;
    /**
     * 浏览次数
     */

    private Integer opusCount;
    /**
     * 点赞次数
     */

    private int opusUp;
    /**
     * 收藏次数
     */

    private int opusCollection;

//    @TableField(exist = false)
    private List<Label> labelList;
}
