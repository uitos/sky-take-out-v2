package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * C端用户登录
 */
@Data
public class UserLoginDTO implements Serializable {

    private  String  telephone;

    private String code;

    private String  location; //  当前用户的经纬度   116.481488,39.990464



}
