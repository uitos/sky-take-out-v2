package com.sky.vo;

import com.sky.pojo.OrderDetail;
import com.sky.pojo.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO extends Orders implements Serializable {

    //订单菜品信息
    private String orderDishes;

    //订单详情
    private List<OrderDetail> orderDetailList;

    //  每一个订单对应的运单状态
    private Integer  waybillStatus;

    //  骑手电话
    private  String  courierTelephone;

    // 顾客性别
    //性别 0 男性   1 女性
    private String sex;

  //商铺联系手机号
  private String shopTelephone;

  // 商铺名称
    private  String shopName;
}
