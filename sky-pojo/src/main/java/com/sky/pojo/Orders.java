package com.sky.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 订单
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders implements Serializable {

    /**  status
     *订单状态 1待付款 2 用户付款成功，等待商家接单  3.商家接单，等待骑手接单
     *   4 骑手接单成功-待取货  5待送达  6已完成  7已取消  8 已退款
     */
    public static final Integer PENDING_PAYMENT = 1;
    public static final Integer TO_BE_CONFIRMED = 2;
    public static final Integer CONFIRMED = 3;
    public static final Integer TOBEPICKEDUP = 4;
    public static final Integer TOBEDELIVERED = 5;
    public static final Integer COMPLETE_ORDER = 6;
    public static final Integer CANCELLED_ORDER = 7;
    public static final Integer TO_BE_REFUND_ORDER = 8;  //  已退款

    /**
     * 支付状态 0未支付 1已支付 2退款  pay_status
     */
    public static final Integer UN_PAID = 0;
    public static final Integer PAID = 1;
    public static final Integer REFUND = 2;

    private static final long serialVersionUID = 1L;

    private Long id;

    //订单号
    private String number;

    //订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消 7退款
    private Integer status;

    //下单用户id
    private Long userId;

    //地址id
    private Long addressBookId;

    //下单时间
    private LocalDateTime orderTime;

    //结账时间
    private LocalDateTime checkoutTime;

    //支付方式 1微信，2支付宝
    private Integer payMethod;

    //支付状态 0未支付 1已支付 2退款
    private Integer payStatus;

    //实收金额
    private BigDecimal amount;

    //备注
    private String remark;

    //用户名
    private String userName;

    //手机号
    private String phone;

    //地址
    private String address;

    //该订单出餐时间： 单位 分钟
    private LocalDateTime mealTime;

    //收货人
    private String consignee;

    //订单取消原因
    private String cancelReason;

    //订单拒绝原因
    private String rejectionReason;

    //订单取消时间
    private LocalDateTime cancelTime;

    //预计送达时间
    private LocalDateTime estimatedDeliveryTime;

    //配送状态  1立即送出  0选择具体时间
    private Integer deliveryStatus;

    //完成时间- 订单完成时间= 运单结束时间
    private LocalDateTime deliveryTime; // delivery_time

    //打包费
    private int packAmount;

    //餐具数量
    private int tablewareNumber;

    //餐具数量状态  1按餐量提供  0选择具体数量
    private Integer tablewareStatus;

    //  订单对应的菜品信息
    List<OrderDetail> orderDetailList;

    private  Long shopId; //  商铺编号

    private  BigDecimal deliveryFee; //  配送费O

}
