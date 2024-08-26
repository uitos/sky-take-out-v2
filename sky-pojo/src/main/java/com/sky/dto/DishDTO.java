package com.sky.dto;

import com.sky.pojo.DishFlavor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDTO implements Serializable {

    private Long id;
    //菜品名称
    private String name;
    //菜品分类id
    private Long categoryId;
    //菜品价格
    private BigDecimal price;
    //图片
    private String image;
    //描述信息
    private String description;

    //  菜品制作时间 前端传递分钟数
    private Integer makeTime;
    //0 停售 1 起售
    private Integer status;
    //口味   [{name:"",dish_id:"",value:""},{},{},{}]
    private List<DishFlavor> flavors = new ArrayList<>();

}
