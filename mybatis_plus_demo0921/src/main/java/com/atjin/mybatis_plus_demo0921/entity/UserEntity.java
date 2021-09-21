package com.atjin.mybatis_plus_demo0921.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.PipedReader;
import java.util.Date;

/**
 * @Author wangshuguang
 * @Date 2021/9/21 9:56
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class UserEntity {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private Integer age;

    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private  Integer version;
}
