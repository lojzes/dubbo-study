package com.lojzes.dubbo;

import com.lojzes.dubbo.config.SystemConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-06 14:31
 **/
public class Provider {
    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(SystemConfig.class);
        annotationConfigApplicationContext.start();
        System.out.println("启动成功");
        System.in.read();
    }
}
