/*
 * 文件名：AbstractHandle.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.chainengine.handle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hw.pps.gadget.chainengine.ChainContext;
import com.hw.pps.gadget.chainengine.model.ExitInfoType;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2018年3月2日
 * @see AbstractHandle
 * @since
 */
public abstract class AbstractHandle
{
    protected final Logger LOGGER = LogManager.getLogger(this.getClass());
    
    protected abstract String invoke(ChainContext context);
    
    protected void before(ChainContext context)
    {
        
    }
    
    protected void after(ChainContext context)
    {
        
    }
    
    public final String doHandle(ChainContext context)
    {
        String exit = ExitInfoType.NORMAL;
        try
        {
            before(context);
            exit = invoke(context);
            after(context);
        }
        catch (Throwable th)
        {
            exit = ExitInfoType.EXCEPTION;
            context.setLastExecuteError(th);
        }
        
        return exit;
    }
    

}
