package com.sky.vo;

import com.sky.pojo.CourierTradeOrder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 *    骑手端： 待接单列表信息、待取货列表信息、待送达页面信息  展示对象
 */
@Data
public class CourierTradeOrderVO extends CourierTradeOrder {
    //  展示数据：当前运单号 、 顾客期望送达时间、商家地址、顾客地址、商家和当前快递员的距离 、 商家和顾客的距离 、当前时间和顾客期望的时间 ：分

    private  Double  shopAndCourierDistance; //  商家和当前快递员的距离
    private Double shopAndCustomerDistance; // 商家和顾客的距离  单位 ：米
    private  Long currentTimeAndCustomerExpectedTime ; // 当前时间和顾客期望的时间  ： 秒
    private  Integer markSort; // 快递员运单序号 ： 排序给每一个运单添加一个序号


//    private  Integer tradeTimeOut  ; //  超时时间  单位秒
//    private  String cancelReason; // 订单取消的原因
//    private  String rejectionReason; // 拒单的原因

}
