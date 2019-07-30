package com.jorchi.elevator.vos.vo;

import lombok.Data;

@Data
public class TodayVO {
    private Integer maintenanceUpload;
    private Integer checked;
    private Integer qualityInspection;
    private Integer patrolAnomaly;
}
