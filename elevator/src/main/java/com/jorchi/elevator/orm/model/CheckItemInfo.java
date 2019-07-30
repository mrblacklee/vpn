package com.jorchi.elevator.orm.model;

import java.util.Date;

public class CheckItemInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.checkitem_id
     *
     * @mbggenerated
     */
    private Integer checkitemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.check_info_id
     *
     * @mbggenerated
     */
    private Long checkInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.check_info
     *
     * @mbggenerated
     */
    private String checkInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.image_source
     *
     * @mbggenerated
     */
    private String imageSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.create_by
     *
     * @mbggenerated
     */
    private Long createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.update_by
     *
     * @mbggenerated
     */
    private Long updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_checkitem_info.problem
     *
     * @mbggenerated
     */
    private String problem;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_checkitem_info
     *
     * @mbggenerated
     */
    public CheckItemInfo(Long id, Integer checkitemId, Long checkInfoId, String checkInfo, String imageSource, Integer status, Date createTime, Long createBy, Date updateTime, Long updateBy, String problem) {
        this.id = id;
        this.checkitemId = checkitemId;
        this.checkInfoId = checkInfoId;
        this.checkInfo = checkInfo;
        this.imageSource = imageSource;
        this.status = status;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
        this.problem = problem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_checkitem_info
     *
     * @mbggenerated
     */
    public CheckItemInfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.id
     *
     * @return the value of e_checkitem_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.id
     *
     * @param id the value for e_checkitem_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.checkitem_id
     *
     * @return the value of e_checkitem_info.checkitem_id
     *
     * @mbggenerated
     */
    public Integer getCheckitemId() {
        return checkitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.checkitem_id
     *
     * @param checkitemId the value for e_checkitem_info.checkitem_id
     *
     * @mbggenerated
     */
    public void setCheckitemId(Integer checkitemId) {
        this.checkitemId = checkitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.check_info_id
     *
     * @return the value of e_checkitem_info.check_info_id
     *
     * @mbggenerated
     */
    public Long getCheckInfoId() {
        return checkInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.check_info_id
     *
     * @param checkInfoId the value for e_checkitem_info.check_info_id
     *
     * @mbggenerated
     */
    public void setCheckInfoId(Long checkInfoId) {
        this.checkInfoId = checkInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.check_info
     *
     * @return the value of e_checkitem_info.check_info
     *
     * @mbggenerated
     */
    public String getCheckInfo() {
        return checkInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.check_info
     *
     * @param checkInfo the value for e_checkitem_info.check_info
     *
     * @mbggenerated
     */
    public void setCheckInfo(String checkInfo) {
        this.checkInfo = checkInfo == null ? null : checkInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.image_source
     *
     * @return the value of e_checkitem_info.image_source
     *
     * @mbggenerated
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.image_source
     *
     * @param imageSource the value for e_checkitem_info.image_source
     *
     * @mbggenerated
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource == null ? null : imageSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.status
     *
     * @return the value of e_checkitem_info.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.status
     *
     * @param status the value for e_checkitem_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.create_time
     *
     * @return the value of e_checkitem_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.create_time
     *
     * @param createTime the value for e_checkitem_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.create_by
     *
     * @return the value of e_checkitem_info.create_by
     *
     * @mbggenerated
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.create_by
     *
     * @param createBy the value for e_checkitem_info.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.update_time
     *
     * @return the value of e_checkitem_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.update_time
     *
     * @param updateTime the value for e_checkitem_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.update_by
     *
     * @return the value of e_checkitem_info.update_by
     *
     * @mbggenerated
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.update_by
     *
     * @param updateBy the value for e_checkitem_info.update_by
     *
     * @mbggenerated
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_checkitem_info.problem
     *
     * @return the value of e_checkitem_info.problem
     *
     * @mbggenerated
     */
    public String getProblem() {
        return problem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_checkitem_info.problem
     *
     * @param problem the value for e_checkitem_info.problem
     *
     * @mbggenerated
     */
    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }
}