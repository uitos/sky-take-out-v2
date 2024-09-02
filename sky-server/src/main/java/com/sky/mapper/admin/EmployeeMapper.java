package com.sky.mapper.admin;


import com.sky.dto.EmployeePageQueryDTO;
import com.sky.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);


    int insert(Employee employee);

    /**
     * 分页查询
     * @param dto
     * @return
     */
    List<Employee> pageQuery(EmployeePageQueryDTO dto);
}
