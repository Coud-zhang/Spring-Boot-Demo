package com.zkq.boot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangkaiqiang
 * @Date 2019/1/23  15:09
 * @Description TODO
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hell";
    }
}
