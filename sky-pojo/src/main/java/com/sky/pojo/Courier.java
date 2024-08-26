package com.sky.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Courier {
    private  Long  id;     //  快递员编号
    private  String name;  //  快递员姓名
    private  String telephone;  //  快递员电话
    private  String worksetLocation; // 快递员所在的站点
    private  String  curLocation; // 快递员当前所在的位置  经纬度
    private  Integer onJob;  //  快递员 是否在职   0  休息  1  上班
    private  Double score;  //  快递员评分   4.9分
    private Integer totalOrderQuantity ;  //  快递员总结单量
    private Integer isConform ;  //  符合条件的快递员  0  不符合  1 符合
    private BigDecimal riderAccount ;  // 骑手账户金额
    private List<Long> tradeNos;//  快递员所有的运单号
    private Double  curCourierAndShopDistance; //  当前骑手和商家的实际距离

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Courier courier = (Courier) o;
        return Objects.equals(id, courier.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
