package com.itliulin.configclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liulin
 * @date 2018/12/11
 */
@RestController
public class ProductController {

    private  String profile;

    @RequestMapping("/hello")
    public String hello(){
        return null;
    }
}