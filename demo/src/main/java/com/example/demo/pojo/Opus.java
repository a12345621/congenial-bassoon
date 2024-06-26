package com.example.demo.pojo;



import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
* 用户文章
* @TableName opus
*/
@Data
//@Table(schema = "opus")
@NoArgsConstructor
@AllArgsConstructor
public class Opus {

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
    * 文章标签(关联文章标签表)
    */

    private List<Integer> opusLabelId;

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

    private Integer opuCount;
    /**
     * 点赞次数
     */

    private int opusUp;
    /**
     * 收藏次数
     */

    private int opusCollection;
}
