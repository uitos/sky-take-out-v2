package com.sky.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopVO {
    private Long id;
    private  String phone;
    private String  shopAddress;
    private String  shopName;
}
