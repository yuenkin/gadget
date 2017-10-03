/*
 * 文件名：DefaultCollector.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.javautil.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hw.pps.gadget.javautil.Collector;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2017年10月3日
 * @see DefaultCollector
 * @since
 */
public class DefaultCollector implements Collector
{

    protected static final Logger LOG = LogManager.getLogger(DefaultCollector.class);

    private static final DefaultCollector INSTANCE = new DefaultCollector();
    
    private DefaultCollector()
    {
        
    }
    
    public static DefaultCollector getInstance()
    {
        return INSTANCE;
    }
    
    
    @Override
    public void collect(String msg)
    {
        LOG.debug(msg);
    }

}
