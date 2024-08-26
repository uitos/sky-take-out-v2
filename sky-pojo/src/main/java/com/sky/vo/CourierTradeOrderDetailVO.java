package com.sky.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CourierTradeOrderDetailVO {
     private Double tradeOrderAverageDuration;// 运单平均配送时长  单位-分钟
     private  Integer  tradeOrdersCancelled;// 异常取消的运单量
     private  Double  tradOrderOnTimeRate;// 运单配送准时率
     private List<CourierTradeOrderDetailItemVO> tradeOrderDetails; //运单明细对象
     private  Integer  tradeOrdersCompleted; //  已完成运单单量
}
