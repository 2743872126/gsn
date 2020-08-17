package com.aaa.controller;

import com.aaa.dao.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    ProductService productService;
    @RequestMapping("test")
    public String test(){
        return productService.a();
    }

    @RequestMapping("select")
    public String select(){
        return productService.select();
    }
}
