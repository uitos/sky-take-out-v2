package com.sky.mapper.admin;


import com.sky.pojo.Employee;
import org.apache.ibatis.annotations.*;



public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);


    }
