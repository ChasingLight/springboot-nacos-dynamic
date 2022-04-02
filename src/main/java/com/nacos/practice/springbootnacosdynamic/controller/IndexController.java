package com.nacos.practice.springbootnacosdynamic.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.nacos.practice.springbootnacosdynamic.feign.NacosDynamicFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private NacosDynamicFeign nacosDynamicFeign;

    @NacosValue(value = "${switch}", autoRefreshed = true)
    private boolean switchValue;

    /**
     * 模拟下游接口功能切换。上游自己通过【开关】动态请求不同版本接口
     */
    @GetMapping("/dynamicReq")
    public void test1() {

        //1.先读取nacos中配置中心的开关
        System.out.println("从nacos配置中心获取到的开关值为：" + switchValue);

        //2.根据开关配置，决定使用Feign进行远程调用【version1、version2】
        if (switchValue){
            nacosDynamicFeign.version2();
        }else{
            nacosDynamicFeign.version1();
        }
    }
}

