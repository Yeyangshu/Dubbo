package com.yeyangshu.service.impl;

import com.yeyangshu.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2021/2/9 21:24
 */
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "demo service provider：" + name;
    }

}
