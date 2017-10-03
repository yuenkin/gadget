# gadget
扩展Java一些常用的第三方框架的工具集合

## 具体功能 
* 扩展log4j2的PatternLayout，支持自定义日志字段，比如：%pps{key1}{key2}
```xml
    <appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] - %pps{key1}{key2}|%msg%n"/>
        </Console>
    </appenders>
``` 
* 提供可监控的容器、线程等资源集合
