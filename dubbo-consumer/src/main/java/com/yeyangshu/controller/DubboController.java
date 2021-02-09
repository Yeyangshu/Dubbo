package com.yeyangshu.controller;

import com.yeyangshu.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2021/2/9 21:34
 */
public class DubboController {

    @DubboReference(version = "1.0.0")
    DemoService demoService;

    @GetMapping("/dobbo")
    public void dubbo() {
        demoService.sayHello("comsumer");
    }
}
