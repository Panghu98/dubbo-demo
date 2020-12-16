package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.DemoService;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 20:14 2020/12/16
 * @Modified By:
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
