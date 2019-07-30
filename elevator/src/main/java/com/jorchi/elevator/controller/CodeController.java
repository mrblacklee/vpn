package com.jorchi.elevator.controller;

import com.jorchi.elevator.MyWebSocket;
import com.jorchi.elevator.service.CodeService;
import com.jorchi.elevator.vos.commons.ApiResult;
import com.jorchi.elevator.vos.vo.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/api/code")
public class CodeController {
    @Resource
    private CodeService codeService;
    @Resource
    private MyWebSocket myWebSocket;

    @RequestMapping(value = "/coordinate",method = RequestMethod.GET)
    public ApiResult<List<CodeVO>> selectCoordinate(){
        ApiResult<List<CodeVO>> rtn=new ApiResult();
        rtn.setData(codeService.selectCoordinate());
        rtn.setCode(0);
        rtn.setMessage("查询成功");
        return rtn;
    }

    @RequestMapping(value = "/today",method = RequestMethod.GET)
    public ApiResult<AmountVO> selectAmount(){
        ApiResult<AmountVO> rtn=new ApiResult<>();
        rtn.setData(codeService.selectAmount());
        rtn.setCode(0);
        rtn.setMessage("查询成功");
        try {
            myWebSocket.sendMessage(codeService.selectAmount());
        }catch (Exception e){
            e.printStackTrace();
        }
        return rtn;
    }

    @RequestMapping(value = "/house",method = RequestMethod.GET)
    public ApiResult<List<HouseVO>> selectHouse(){
        ApiResult<List<HouseVO>> rtn=new ApiResult<>();
        rtn.setData(codeService.selectHouse());
        rtn.setCode(0);
        rtn.setMessage("查询成功");
        try {
            myWebSocket.sendMessage(codeService.selectHouse());
        }catch (Exception e){
            e.printStackTrace();
        }
        return rtn;
    }

    @RequestMapping(value = "/inspect",method = RequestMethod.GET)
    public ApiResult<List<InspectVO>> selectInspect(){
        ApiResult<List<InspectVO>> rtn=new ApiResult<>();
        rtn.setData(codeService.selectInspect());
        rtn.setCode(0);
        rtn.setMessage("查询成功");
        try {
            myWebSocket.sendMessage(codeService.selectInspect());
        }catch (Exception e){
            e.printStackTrace();
        }
        return rtn;
    }

    @RequestMapping(value = "/array",method = RequestMethod.GET)
    public ApiResult<ArrayList> selectTrend(){
        ApiResult<ArrayList> rtn=new ApiResult();
        rtn.setData(codeService.selectTrend());
        rtn.setCode(0);
        rtn.setMessage("查询成功");
        return rtn;
    }

    @RequestMapping(value = "/trend",method = RequestMethod.GET)
    public ApiResult<ArrayList> monthlyTrend(){
        ApiResult rtn=new ApiResult();
        rtn.setData(codeService.monthlyTrend());
        rtn.setCode(0);
        rtn.setMessage("查询成功");
        return rtn;
    }
}
