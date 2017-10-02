/*
 * 文件名：Log4j2Context.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.log4j2;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2017年10月2日
 * @see Log4j2Context
 * @since
 */
public class Log4j2Context
{
    // 使用线程本地变量存储日志信息
    private static final ThreadLocal<Map<String, String>> LOCAL_MAP = new ThreadLocal<Map<String,String>>() 
    {
        @Override
        protected Map<String, String> initialValue() {
            return new HashMap<String, String>();
        }
        
    };
   
    /**
     * 
     * 设置PPSPatternConverter中%pps{key1}{key2}{key3}{...}某个key对应的value
     * 
     * @param key 参数名称
     * @param value 值
     * @see
     */
    public static void set(String key, String value)
    {
        LOCAL_MAP.get().put(key, value);
    }
    
    public static String get(String key)
    {
        return LOCAL_MAP.get().get(key);
    }
    
    
    public static void clear()
    {
        LOCAL_MAP.get().clear();
    }

}
