/*
 * 文件名：Controllable.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.javautil;

/**
 * 
 * 所有定义为资源的实体都应该实现这个接口，方便资源的统一监控
 * 
 * @author Administrator
 * @version 2017年10月3日
 * @see Controllable
 * @since
 */
public interface Controllable
{
    /**
     * 
     * 资源初始化操作
     * 
     * @return 
     * @see
     */
    boolean initialize();
    
    /**
     * 
     * 资源的唯一名称
     * 
     * @return 
     * @see
     */
    String getName();
    void setName(String name);
    
    /**
     * 
     * 资源响应外部统计模块事件。外部模块只负责触发统计事件，
     * 具体事件响应还得具体资源自己处理，比如搜集资源状态后输出到日志文件中。
     * @see
     */
    void onCollect();
    
    Collector getCollector();
    void setCollector(Collector collector);
    
    /**
     * 
     * 资源销毁操作
     * 
     * @return 
     * @see
     */
    boolean destroy();
}
