package com.sky.constant;

/**
 * 状态常量，启用或者禁用
 */
public class StatusConstant {

    //启用
    public static final Integer ENABLE = 1;

    //禁用
    public static final Integer DISABLE = 0;


    //  运单状态 1调度成功，骑手未接单  2 骑手接单，开启配送中  3.骑手确认取货，运单状态修改为    5. 运单取消：顾客申请取消订单，导致运单自动取消  4 运单完成
    public static final Integer DISPATCH_OK = 1;
    public static final Integer DELIVORING = 2;
    public static final Integer CONFIRM_TRADE = 3;
    public static final Integer TRADE_COMPLETE = 4;
    public static final Integer CANCLE_TRADE = 5;
}
