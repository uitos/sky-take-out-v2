package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("员工分页DTO对象")
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    @ApiModelProperty("员工姓名")
    //如果空字符提示未找到相关员工
    private String name;

    //页码
    @ApiModelProperty("分页页码")
    @NotNull(message = "分页页码不能为空")
    private int page;

    //每页显示记录数
    @ApiModelProperty("每页记录数")
    @NotNull(message = "每页记录数不能为空")
    private int pageSize;

}
