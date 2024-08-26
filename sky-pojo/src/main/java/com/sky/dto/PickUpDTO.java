package com.sky.dto;

import lombok.Data;

/**
 *   确认取餐  put请求参数封装
 */
@Data
public class PickUpDTO {
    private Long tradeNo;
    private Integer status;
}
