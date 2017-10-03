/*
 * 文件名：ControllableManager.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.javautil;

import com.hw.pps.gadget.javautil.impl.ControllableConcurrentHashMap;
import com.hw.pps.gadget.javautil.impl.DefaultCollector;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2017年10月3日
 * @see ControllableManager
 * @since
 */
public class ControllableManager
{
    public static final Integer MAX_SIZE = 50000;
    
    private static final ControllableConcurrentMap<String, Controllable> MAP = 
        new ControllableConcurrentHashMap<>(ControllableManager.class.getSimpleName(), DefaultCollector.getInstance());
    
    /**
     * 
     * @param res
     * @return 
     * @see
     * @throws IllegalStateException 如果存在同名的资源
     */
    public static boolean register(Controllable res) 
    {
        // 已经注册过了，直接返回成功
        if (res == MAP.get(res.getName()))
        {
            return true;
        }
        
        if (MAP.containsKey(res.getName()))
        {
            throw new IllegalStateException("Duplicate controllable name: " + res.getName());
        }
        
        // 限制下ControllableManager监控的数量，防止自己造成OOM
        int size = MAP.size();
        if (size >= MAX_SIZE)
        {
            throw new IllegalStateException("ControllableManager is full: " + size);
        }
        
        return null == MAP.putIfAbsent(res.getName(), res);
    }
    
    public static boolean unregister(String name)
    {
        return null != MAP.remove(name);
    }
    
    public static boolean unregister(Controllable res)
    {
        return null != MAP.remove(res.getName());
    }
    
    public static void collect()
    {
        MAP.forEach((k, v) -> {
            v.onCollect();
        });
    }
    

}
