package com.jorchi.elevator.vos.vo;

import lombok.Data;

import java.util.Date;

@Data
public class HouseVO {
    private String areaName;
    private String pointName;
    private String endTime;
    private String uploadTime;
    private Integer haoshi;
    private String isCheck;
}
