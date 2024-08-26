package com.sky.exception;

/**
 * 账号被锁定异常
 */
public class NoCourierException extends BaseException {

    public NoCourierException() {
    }

    public NoCourierException(String msg) {
        super(msg);
    }

}
