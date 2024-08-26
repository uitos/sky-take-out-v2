package com.sky.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *   快递运单对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourierTradeOrder implements Serializable {

    //  运单状态 1调度成功，骑手未接单  2 骑手接单，开启配送中  3.骑手确认取货，运单状态修改为    5. 运单取消：顾客申请取消订单，导致运单自动取消  4 运单完成
    public static final Integer DISPATCH_OK = 1;
    public static final Integer DELIVORING = 2;
    public static final Integer CONFIRM_TRADE = 3;
    public static final Integer TRADE_COMPLETE = 4;
    public static final Integer CANCLE_TRADE = 5;

    private  Long  tradeNo;     // 运单号
    private BigDecimal totalAmount;  //  运单金额
    private  Long courierId; // 快递员编号
    private  String  remark; //  运单说明
    private  String  shopAddress; //  商家地址
    private  String  orderNumber; //  用户下单的订单号
    private  Integer  waybillStatus; //   运单状态 ：1调度成功，骑手未接单 2 骑手接单，开启配送  3. 运单完成
    private LocalDateTime tradeCreateTime; // 运单创建时间
    private  LocalDateTime  tradeCompleteTime; // 运单完成时间
    private  LocalDateTime  tradeCancelTime; // 运单取消时间
    private  Integer overTime;// 运单超时时间
    private  String courierTelephone;// 骑手电话

    private String customerAddress;  //用户地址
    private LocalDateTime customerExpectedDeliveryTime; //预计送达时间
    private String customerName; //客户名称
    private String shopName;//商家名称
    private String telephone; //客户手机号
    private LocalDateTime toBeMealTime; //商家出餐时间
}
