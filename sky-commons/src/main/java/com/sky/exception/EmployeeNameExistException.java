package com.sky.exception;



public class EmployeeNameExistException extends BaseException {
    public EmployeeNameExistException() {
    }

    public EmployeeNameExistException(String msg) {
        super(msg);
    }
}
