package com.sky.service.admin.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sky.constant.MessageConstant;
import com.sky.constant.PasswordConstant;
import com.sky.constant.StatusConstant;
import com.sky.context.BaseContext;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.exception.*;
import com.sky.mapper.admin.EmployeeMapper;
import com.sky.pojo.Employee;
import com.sky.result.PageResult;
import com.sky.service.admin.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    @Override
    public Employee login(EmployeeLoginDTO employeeLoginDTO) {
        String username = employeeLoginDTO.getUsername();
        String password = employeeLoginDTO.getPassword();//

        //1、根据用户名查询数据库中的数据  select * from employee where username = #{username}
        Employee employee = employeeMapper.getByUsername(username); //

        //2、处理各种异常情况（用户名不存在、密码不对、账号被锁定）
        if (employee == null) {
            //账号不存在
            throw new AccountNotFoundException(MessageConstant.ACCOUNT_NOT_FOUND);
        }

        //密码比对
        // TODO 后期需要进行md5加密，然后再进行比对
        if (!password.equals(employee.getPassword())) {
            //密码错误
            throw new PasswordErrorException(MessageConstant.PASSWORD_ERROR);
        }

        if (employee.getStatus() == StatusConstant.DISABLE) {
            //账号被锁定
            throw new AccountLockedException(MessageConstant.ACCOUNT_LOCKED);
        }
        //3、返回实体对象
        return employee;
    }

    /**
     * 新增员工
     * @param employeeDTO
     */
    @Override
    public void save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        employee.setCreateTime(LocalDateTime.now());
        employee.setUpdateTime(LocalDateTime.now());
        employee.setCreateUser(BaseContext.getCurrentId());
        employee.setUpdateUser(BaseContext.getCurrentId());
        employee.setStatus(StatusConstant.ENABLE);
        Employee emp = employeeMapper.getByUsername(employee.getUsername());
        if(Objects.nonNull(emp)){
            throw new EmployeeNameExistException(MessageConstant.EMPLOYEE_USERNAME_EXISTS);
        }
        employee.setPassword(PasswordConstant.DEFAULT_PASSWORD);
        int empRows = employeeMapper.insert(employee);
    }

    /**
     * 分页查询
     * @param dto
     * @return
     */
    @Override
    public PageResult pageQuery(EmployeePageQueryDTO dto) {
        //查询名称为空
        if (Objects.nonNull(dto.getName())&&dto.getName().isBlank()){
            //未找到相关员工
            throw new EmployeeException(MessageConstant.EMPLOYEE_NOT_FOUND);
        }
        Page<Object> page = PageHelper.startPage(dto.getPage(), dto.getPageSize());
        String name = dto.getName();
        if (Objects.nonNull(dto.getName())&&dto.getName().isBlank()){
            //删除所有前导和尾随空格
            String trimName = name.trim();
            dto.setName(trimName);
        }

        List<Employee> list =  employeeMapper.pageQuery(dto);
        return new PageResult(page.getTotal(),list);
    }


}
