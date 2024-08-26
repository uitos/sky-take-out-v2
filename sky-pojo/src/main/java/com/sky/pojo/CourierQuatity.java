package com.sky.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourierQuatity {
    private  Long  curid;     //  接单量id
    private  Integer courierCurdayQuatity;  //  快递员当天的接单量
    private  LocalDateTime receiveDay; //快递员接单每天的时间
    private  Long  courierId; // 快递员编号
    private  Long  tradeNo; // 当前运单编号
    private  BigDecimal cost; // 当前运单小件快递员提成费用

}
