package com.jorchi.elevator;

import com.alibaba.fastjson.JSON;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;



public class EncodeClass implements Encoder.Text<Object> {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void init(EndpointConfig arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public String encode(Object messagepojo) throws EncodeException {
        try {
            return JSON.toJSONString(messagepojo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "error";
        }
    }

}
