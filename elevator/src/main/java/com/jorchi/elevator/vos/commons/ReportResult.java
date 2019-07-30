package com.jorchi.elevator.vos.commons;

import lombok.Data;

/**
 * @author zjy
 * @time 2018/04/25 10:59.
 */
@Data
public class ReportResult {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private int code;
    private String msg;
    private String id;
}
