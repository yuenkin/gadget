/*
 * 文件名：ChainSession.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.chainengine;

import lombok.Getter;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2018年3月2日
 * @see ChainSession
 * @since
 */
@SuppressWarnings("unchecked")
public class ChainSession
{
    @Getter
    private long startTime = System.currentTimeMillis();
    
    @Getter
    private String sessionId;
    
    @Getter 
    private ChainContext context;
    
    private ChainRequestEvent<?> requestEvent;
    private ChainResponseEvent<?> responseEvent;
    
    public ChainSession(ChainRequestEvent<?> request, String sessionId)
    {
        this.requestEvent = request;
        this.sessionId = sessionId;
    }
    
    public <T> ChainRequestEvent<T> getRequestEvent()
    {
        return (ChainRequestEvent<T>) requestEvent;
    }
    
   
    
    public <T> ChainResponseEvent<T> getResponseEvent()
    {
        return (ChainResponseEvent<T>) responseEvent;
    }
    
    public <T> void setResponseEvent(ChainResponseEvent<T> rsp)
    {
        this.responseEvent = rsp;
    }
}
