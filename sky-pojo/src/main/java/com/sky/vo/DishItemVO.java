package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DishItemVO implements Serializable {

    //菜品名称  setmeal_dish
    private String name;

    //份数   setmeal_dish
    private Integer copies;

    //菜品图片  dish
    private String image;

    //菜品描述 dish
    private String description;
}
