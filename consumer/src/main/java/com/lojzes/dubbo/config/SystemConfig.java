package com.lojzes.dubbo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-16 10:32
 **/
@ComponentScan("com.lojzes.dubbo")
@ImportResource("classpath:consumer.xml")
public class SystemConfig {
}
