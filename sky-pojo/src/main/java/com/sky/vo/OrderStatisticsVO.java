package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *   各个状态下 订单数量统计
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatisticsVO implements Serializable {
    //  等待商家接单数 2
    private Integer waiting4MerchantReceiveOrders;

    //等待骑手接单数 3
    private Integer waitng4RiderReceiveOrders;

    //待出货订单数 4
    private Integer toBeDeliveryOnProgressOrders;

    //待送达订单数 5
    private Integer toBeArrivedOrders;

    //已经完成的订单数  6
    private Integer completedOrders;

    //已取消的订单数  7
    private Integer canceledOrders;
}
