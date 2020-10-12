package com.jd.sign.schudling;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyDisposableBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("结束");
        RestTemplate template = new RestTemplate();
        Map<String, String> params = new HashMap<>();
        String push = "https://api.day.app/XGJxUAwQRa4ARoKTN7Q4aB/Spring签到服务/"+"服务已停用";
        template.postForEntity(push, params,String.class);
    }

}

