package com.sky.vo;

import lombok.Data;

/**
 *   显示订单明菜品细信息
 *   骑手到商家取餐，确认菜品信息
 */
@Data
public class OrderDetailVO {

    private String name;//  菜品名称
    private Integer number;//  菜品数量
}
