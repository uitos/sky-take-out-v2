package com.sky.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *  商家店铺信息（未完整）
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Merchant implements Serializable {

    private static final long serialVersionUID = 1L;
    // 商品编号
    private Long id;
    //  商铺号
    private String merchantNo;
    //  商铺名称
    private String shopName;
    //商铺联系手机号
    private String shopTelephone;
    // 商铺地址
    private String shopAddress;
    //商铺配送时间范围
    private String deliveryTime;
    //商铺评价
    private String merchantEvaluation;
    //商品食品安全档案
    private String merchantFoodSafetyArchives;
    //商品是否提供 配送费   1  商家提供配送费 顾客无需支付   0  否  需要支付配送费
    private String merchantProvidesDeliveryFees;


}
