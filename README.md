1.2022-04-02-测试Nacos作为配置中心，修改开关配置后，服务是否需要重启？

答：不需要重启，但是代码中需要-**显式设置自动刷新**。

```java
@NacosValue(value = "${switch}", autoRefreshed = true)  //默认是不自动刷新的
private boolean switchValue;
```

2.拓展：【单独使用Feign、单独使用Nacos配置中心】------模拟下游接口功能升级，上游自己通过【开关】动态请求不同版本接口。


3.参考链接：

1>【单独使用feign】https://www.jianshu.com/p/22c009c9e1b4
2>【springboot使用nacos做配置中心】https://www.jianshu.com/p/db099b74682d