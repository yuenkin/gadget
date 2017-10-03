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
* 提供资源监控的统一模型，比如Java集合类、定时任务执行情况等：
你想监控Map对象的size并定时输出到日志文件中，你可以直接使用ControllableHashMap或者线程安全的ControllableConcurrentHashMap；
监控结果的输出你可以选择默认的DefaultCollector（log4j2日志输出），或者实现自己的Collector。

