package com.sky.exception;

/**
 * 账号被锁定异常
 */
public class CourierTradeOrderNotExistException extends BaseException {

    public CourierTradeOrderNotExistException() {
    }

    public CourierTradeOrderNotExistException(String msg) {
        super(msg);
    }

}
