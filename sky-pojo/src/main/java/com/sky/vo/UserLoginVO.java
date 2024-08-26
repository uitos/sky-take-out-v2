package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginVO implements Serializable {

    private Long id;
    private String openid; // 小程序登录需要的openid
    private String token;//  token
    private String shopName; //  商家名称
    private String shopAddress; //  商家位置
    private String shopTelephone; //  商家电话
    private BigDecimal deliveryFee; //  配送费
    private  Long  shopId;//  商铺id

}
