package com.zszxz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> </p>
 */
@Controller// 声明一个控制器
public class HelloController {

    // 接收GET请求
    @RequestMapping(value = "/zszxz",method = RequestMethod.GET)
    public String hello(){
        // 视图名称
        return "hello";
    }
}
