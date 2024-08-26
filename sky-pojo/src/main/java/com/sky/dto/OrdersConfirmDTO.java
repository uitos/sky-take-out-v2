package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrdersConfirmDTO implements Serializable {

    //  订单号
    private Long id;
    // 订单状态 1待付款  2 等待商家接单  3待取货  4待送达  5已完成  6已取消
    private Integer status;

}
