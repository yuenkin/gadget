/*
 * 文件名：PPSPatternConverterTest.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.log4j2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PPSPatternConverterTest
{
    public static Logger logger = LogManager.getLogger(PPSPatternConverterTest.class.getName());
    public static void main(String[] args) throws InterruptedException
    {
        Log4j2Context.set("key1", "32098888");
        Log4j2Context.set("key2", "hellowc");
        logger.debug("今天我不在家~");
        
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i ++)
        {
            service.submit(new LoggerTask(i));
        }
        
        service.shutdown();
        service.awaitTermination(Long.MAX_VALUE, TimeUnit.HOURS);
        
    }
}
