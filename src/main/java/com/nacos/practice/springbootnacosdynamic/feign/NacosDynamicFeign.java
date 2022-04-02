package com.nacos.practice.springbootnacosdynamic.feign;

import feign.RequestLine;

/**
 * 请求下游-NacosDynamic的FeingClient客户端
 */
public interface NacosDynamicFeign {

    @RequestLine("GET /version1")
    void version1();

    @RequestLine("GET /version2")
    void version2();
}


