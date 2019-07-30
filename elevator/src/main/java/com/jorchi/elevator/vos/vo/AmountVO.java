package com.jorchi.elevator.vos.vo;

import lombok.Data;

@Data
public class AmountVO {
    private String elevatorCount;
    private String insureCount;
    private String elevatorBrand;
    private String propertyUnit;
    private String maintenanceUnit;
    private TodayVO today;
}
