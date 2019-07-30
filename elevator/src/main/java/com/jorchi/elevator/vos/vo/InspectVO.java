package com.jorchi.elevator.vos.vo;

import lombok.Data;

import java.util.Date;

@Data
public class InspectVO {
    private String areaName;
    private String checkTime;
    private Integer isOk;
    private Integer number;
    private Integer id;
}
