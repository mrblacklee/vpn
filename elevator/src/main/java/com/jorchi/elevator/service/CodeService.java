package com.jorchi.elevator.service;

import com.jorchi.elevator.dao.CodeDao;
import com.jorchi.elevator.vos.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class CodeService {
    @Resource
    private CodeDao codeDao;

    public List<CodeVO> selectCoordinate(){
        return codeDao.selectCoordinate();
    }

    public AmountVO selectAmount(){
        AmountVO amountVO=new AmountVO();

        TodayVO todayVO=codeDao.selectToday();
        amountVO.setToday(todayVO);
        AmountVO amountVO1= codeDao.selectAmount();
        amountVO.setElevatorBrand(amountVO1.getElevatorBrand());
        amountVO.setElevatorCount(amountVO1.getElevatorCount());
        amountVO.setInsureCount(amountVO1.getInsureCount());
        amountVO.setMaintenanceUnit(amountVO1.getMaintenanceUnit());
        amountVO.setPropertyUnit(amountVO1.getPropertyUnit());
        return amountVO;
    }

    public List<HouseVO> selectHouse(){
        return codeDao.selectHouse();
    }
    public List<InspectVO>selectInspect(){
        List<InspectVO> inspectVOS= codeDao.selectInspect();
        if (inspectVOS.size()!=0){
            for (InspectVO vo:inspectVOS){
               vo.setNumber(codeDao.countNum(vo.getId()));
            }
        }
        return inspectVOS;
    }

    public ArrayList selectTrend(){
        ArrayList arrayList=new ArrayList();
        ArrayVO arrayVO= codeDao.array();
        arrayList.add(arrayVO.getNum2());
        arrayList.add(arrayVO.getNum1());
        arrayList.add(arrayVO.getNum());
        return arrayList;
    }

    public ArrayList monthlyTrend(){
        ArrayList arrayList=new ArrayList();
        ArrayList<Integer> array=codeDao.thread();
        if (array.size()!=0){
            Integer num=0;
            for (int i=0;i<array.size();i++){
                num+=array.get(i);
            }
            arrayList.add(num);
        }
        ArrayList<Integer> array1=codeDao.thread1();
        if (array1.size()!=0){
            Integer num=0;
            for (int i=0;i<array1.size();i++){
                num+=array1.get(i);
            }
            arrayList.add(num);
        }
        ArrayList<Integer> array2=codeDao.thread2();
        if (array2.size()!=0){
            Integer num=0;
            for (int i=0;i<array2.size();i++){
                num+=array2.get(i);
            }
            arrayList.add(num);
        }
        return arrayList;
    }
}
