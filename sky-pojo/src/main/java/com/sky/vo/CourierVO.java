package com.sky.vo;

import com.sky.pojo.Courier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourierVO extends Courier {
     private  Integer  courierCurdayQuatity;//  快递员当天的接单量
     private Long  distance; //  距离
     private String  image;//  头像

}
