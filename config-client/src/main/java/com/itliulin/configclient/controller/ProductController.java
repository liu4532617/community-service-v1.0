package com.itliulin.configclient.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liulin
 * @date 2018/12/11
 */
@RestController
public class ProductController {

    @Value("${version}")
    private String version;

    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    @GetMapping("/hello")
    public Object hello() {
        Map map = new HashMap();
        map.put("age", age);
        map.put("name", name);
        map.put("version", version);
        return ResponseEntity.ok(map);
    }
}