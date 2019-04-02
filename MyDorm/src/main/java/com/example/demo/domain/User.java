package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("user")
public class User {
    @TableId
    private int id;
    private String username;
    private String password;
    @TableField(exist = false)//这个不是数据库里的字段
    private List<Role> roles;
}
