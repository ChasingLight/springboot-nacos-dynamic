package com.nacos.practice.springbootnacosdynamic;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@NacosPropertySource(dataId = "jaden", autoRefreshed = true)
public class SpringbootNacosDynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNacosDynamicApplication.class, args);
    }
}
