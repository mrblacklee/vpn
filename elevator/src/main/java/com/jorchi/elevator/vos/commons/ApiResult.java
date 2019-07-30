package com.jorchi.elevator.vos.commons;

import lombok.Data;

/**
 * @author zjy
 * @time 2018/04/23 18:44.
 */
@Data
public class ApiResult<T> {

    private int code = 0;


    private String status = "0";


    private String message;


    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        if (getCode() != 0 ) {
            setStatus("-1");
        }
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
