package com.jorchi.elevator.dao;


import com.jorchi.elevator.vos.vo.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zjy
 * @time 2018/04/25 14:01.
 */
public interface CodeDao {

    List<CodeVO> selectCoordinate();
    AmountVO selectAmount();
    TodayVO selectToday();
    List<HouseVO> selectHouse();
    List<InspectVO> selectInspect();
    Integer countNum(Integer id);
    ArrayVO array();
    ArrayList<Integer> thread();
    ArrayList<Integer> thread1();
    ArrayList<Integer> thread2();
}
