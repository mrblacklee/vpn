package com.jorchi.elevator.orm.mapper;

import com.jorchi.elevator.orm.model.codeElevator;
import com.jorchi.elevator.orm.model.codeElevatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface codeElevatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int countByExample(codeElevatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int deleteByExample(codeElevatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int insert(codeElevator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int insertSelective(codeElevator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    List<codeElevator> selectByExample(codeElevatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    codeElevator selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") codeElevator record, @Param("example") codeElevatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") codeElevator record, @Param("example") codeElevatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(codeElevator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_code_elevator
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(codeElevator record);
}