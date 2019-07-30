package com.jorchi.elevator.exception;

/**
 * @author zjy
 * @time 2018/04/25 14:16.
 */
public class ApiException extends RuntimeException {

    public ApiException(String msg){
        super(msg);
    }
}
