package com.lojzes.dubbo;

import com.lojzes.common.HelloService;
import com.lojzes.dubbo.config.SystemConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-16 10:29
 **/
public class Consumer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SystemConfig.class);
        HelloService helloService = context.getBean(HelloService.class);
        String lojzes = helloService.sayHello("lojzes");
        System.out.println("lojzes = " + lojzes);
    }
}
