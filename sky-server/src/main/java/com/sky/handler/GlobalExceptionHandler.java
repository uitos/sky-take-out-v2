package com.sky.handler;

import com.sky.exception.*;
import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * 全局异常处理器，处理项目中抛出的业务异常
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 捕获业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public Result exceptionHandler(BaseException ex){
        log.error("异常信息：{}", ex.getMessage());
        return Result.error(ex.getMessage());
    }
    /**
     * 处理MethodArgumentNotValidException异常的方法
     * 当控制器方法参数绑定失败时，会抛出此异常，此方法用于统一处理这类异常，提供相应的错误信息
     *
     * @param ex MethodArgumentNotValidException异常对象
     * @return 返回一个Result对象，携带验证错误信息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex){
        //获取字段验证错误列表
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        StringJoiner sj = new StringJoiner(",","","");
        fieldErrors.forEach(t->{
            //getRejectedValue()获取错误值
            //getDefaultMessage())获取错误描述
            sj.add("（"+t.getRejectedValue() + "）->" + t.getDefaultMessage());
        });
        log.info("异常信息,{}",sj);
        return Result.error(sj.toString());
    }




}
