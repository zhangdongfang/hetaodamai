package com.baxianguohai.hetaodamai.mall.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author:zdf
 * @date:19-11-26
 */
@RestController
public class TemplateController {


    @Autowired
    private  RestTemplate restTemplate;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return restTemplate.getForObject("http://mall-service/echo/", String.class);
    }
}