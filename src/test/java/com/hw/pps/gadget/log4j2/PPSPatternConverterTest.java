/*
 * 文件名：PPSPatternConverterTest.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PPSPatternConverterTest
{
    public static Logger logger = LogManager.getLogger(PPSPatternConverterTest.class.getName());
    public static void main(String[] args)
    {
        Log4j2Context.set("key1", "32098888");
        Log4j2Context.set("key2", "hellowc");
        logger.debug("今天我不在家~");
        
    }
}
