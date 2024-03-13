package com.btchina.content.news.model.qo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class NewsUpdateQO {
    @Schema(description ="分类ID")
    private Long categoryId;

    @Schema(description ="标题")
    private String title;

    @Schema(description ="内容")
    private String content;

    @Schema(description ="是否置顶 1是置顶 0是不置顶")
    private Boolean isTop;

    @Schema(description ="来源")
    private String comeFrom;

    @Schema(description ="点赞数")
    private Integer likeCount;

    @Schema(description ="浏览数")
    private Integer viewCount;

    @Schema(description ="审核状态 0是未审核 1是审核通过 2是审核不通过")
    private Integer status;

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
