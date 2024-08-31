package com.sky.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    private Long id;
    @NotNull
    @Length(min = 3, max = 20,message = "账号输入不符，请输入3-20个字符")
    private String username;
    @NotNull
    //汉字、字母大小写
    @Length(min = 1, max = 12,message = "员工姓名输入不符，请输入1-12个字符")
    @Pattern(regexp = "^[\u4e00-\u9fa5A-Za-z]+$",message = "员工姓名输入不符，请输入汉字、字母")
    private String name;
    @NotNull
    @Length(min = 11, max = 11,message = "请输入正确的手机号")
    @Pattern(regexp = "^[1][3,4,5,6,7,8,9][0-9]{9}$",message = "请输入正确的手机号")
    private String phone;
    @NotNull
    private String sex;
    @Pattern(regexp = "^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$",message = "身份证号码不正确")
    private String idNumber;

}
