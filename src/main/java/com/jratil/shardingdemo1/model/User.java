package com.jratil.shardingdemo1.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
@TableName("user")
public class User implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer id;

    /**
     * 姓
     */
    private String name;

    private static final long serialVersionUID = 1L;
}