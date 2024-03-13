package com.btchina.content.question.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 回答表
 * </p>
 *
 * @author franky
 * @since 2023-02-25
 */
@Getter
@Setter
@TableName("tbl_answer")
@Schema(name = "Answer对象", description = "回答表")
public class Answer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description ="回答id")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @Schema(description ="问题id")
    private Long questionId;

    @Schema(description ="用户id")
    private Long userId;

    @Schema(description ="回答内容")
    private String content;

    @Schema(description ="是否最佳回答 1是 0不是")
    private Integer isBest;

    @Schema(description ="采用数")
    private Integer useCount;

    @Schema(description ="评论数")
    private Integer commentCount;

    @Schema(description ="创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;

    @Schema(description ="更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;

    @Schema(description ="是否删除;1是删除，0是不删除")
    @TableLogic
    private Boolean deleted;


}
