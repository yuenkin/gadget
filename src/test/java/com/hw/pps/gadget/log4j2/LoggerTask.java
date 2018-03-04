/*
 * 文件名：LoggerTask.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月13日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTask implements Runnable
{
    public static Logger logger = LogManager.getLogger(LoggerTask.class.getName());
    private String msg;
    private int id;
    
    public LoggerTask(int id)
    {
        this.id = id;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++)
        {
            sb.append(id);
        }      
        
        msg = sb.toString();
    }

    @Override
    public void run()
    {
        Log4j2Context.set("key1", id + "");

        while (true)
        {
            logger.debug("{}:{}", id, msg);
        }
        
    }

}
