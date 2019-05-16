package com.lojzes.dubbo.service.impl;

import com.lojzes.common.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-06 14:33
 **/
@Service
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
