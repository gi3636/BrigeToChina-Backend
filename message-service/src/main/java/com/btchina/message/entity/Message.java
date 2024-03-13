package com.btchina.message.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 消息表
 * </p>
 *
 * @author franky
 * @since 2023-03-30
 */
@Getter
@Setter
@TableName("tbl_message")
@ToString
@Tag(name = "Message对象", description = "消息表")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description ="ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @Schema(description ="会话ID")
    private Long dialogId;

    @Schema(description ="发送者ID")
    private Long senderId;

    @Schema(description ="接收者ID")
    private Long receiverId;

    @Schema(description ="消息ID(前端消息ID)")
    private String msgId;


    @Schema(description ="聊天类型 1是私聊 2是群聊")
    private Integer chatType;

    @Schema(description ="消息类型 1是文本 2是图片 ")
    private Integer messageType;

    @Schema(description ="消息内容")
    private String content;

    @Schema(description ="是否已读 1是已读 , 0 是未读")
    private Boolean isRead;

    @Schema(description ="是否签收 1是已签收 , 0 是未签收")
    private Boolean signed;

    @Schema(description ="扩展")
    private String extend;

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
