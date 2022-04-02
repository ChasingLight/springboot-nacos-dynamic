package com.nacos.practice.springbootnacosdynamic.feign;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 根据Feign接口，创建所有的客户端@Bean
 */
@Component
public class BuildFeignClient {

    @Bean
    public NacosDynamicFeign create(){
        return Feign.builder().
                target(NacosDynamicFeign.class, "http://127.0.0.1:8099");
    }

}
