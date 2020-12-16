package com.dubbo.provider.service;

import com.dubbo.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 20:34 2020/12/16
 * @Modified By:
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "classpath:consumer.xml" );
        context.start();
        System.out.println("dubbo服务消费端已启动...");
        // 获取远程服务代理
        DemoService demoService = (DemoService)context.getBean( "demoService" );
        //执行远程方法
        String hello = demoService.sayHello( "world" );
        //显示调用结果
        System.out.println(hello);
        // 按任意键退出
        System.in.read();
    }
}