package com.zh.android.lomboksample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//生成get、set方法
@Data
//生成空参构造方法
@NoArgsConstructor
//生成全参构造方法
@AllArgsConstructor
public class User {
    private String userName;
    private String password;
}