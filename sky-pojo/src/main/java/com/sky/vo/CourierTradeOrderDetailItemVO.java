package com.sky.vo;

import lombok.Builder;
import lombok.Data;

/**
 *  当月每一天的 运单量统计
 */
@Data
@Builder
public class CourierTradeOrderDetailItemVO {
     private  Integer  tradeOrdersCompleted; // 已完成运单单量
     private  Integer  tradeOrdersCancelled;//异常取消的运单量
     private  String  tradeOrderDate; //  运单日期    2023-09-01
}
