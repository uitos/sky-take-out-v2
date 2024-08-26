package com.sky.dto;

import com.sky.pojo.SetmealDish;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class SetmealDTO implements Serializable {

    private Long id;

    //分类id
    private Long categoryId;

    //套餐名称
    private String name;

    //套餐价格
    private BigDecimal price;

    //状态 0:停用 1:启用
    private Integer status;

    //描述信息
    private String description;

    //图片
    private String image;

    //  菜品制作时间 前端传递分钟数
    private Integer makeTime;

    //套餐菜品关系
    private List<SetmealDish> setmealDishes = new ArrayList<>();

}
