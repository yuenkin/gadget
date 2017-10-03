/*
 * 文件名：ControllableHashMap.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.javautil.impl;

import java.util.HashMap;
import java.util.Map;

import com.hw.pps.gadget.javautil.Collector;
import com.hw.pps.gadget.javautil.ControllableManager;
import com.hw.pps.gadget.javautil.ControllableMap;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2017年10月3日
 * @see ControllableHashMap
 * @since
 */
public class ControllableHashMap<K, V> extends HashMap<K, V> implements ControllableMap<K, V>
{
    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 2429807158416307294L;
    
    private String name;
    private Collector collector;
    
    public ControllableHashMap(String name, Collector collector)
    {
        super();
        initialize();
        this.name = name;
        this.collector = collector;
    }
    
    public ControllableHashMap(String name, Collector collector, int initialCapacity)
    {
        super(initialCapacity);
        initialize();
        this.name = name;
        this.collector = collector;
    }
    
    public ControllableHashMap(String name, Collector collector, int initialCapacity, float loadFactor)
    {
        super(initialCapacity, loadFactor);
        initialize();
        this.name = name;
        this.collector = collector;
    }
    
    public ControllableHashMap(String name, Collector collector, Map<? extends K, ? extends V> m)
    {
        super(m);
        initialize();
        this.name = name;
        this.collector = collector;
    }

    @Override
    public boolean initialize()
    {
        ControllableManager.register(this);
        return true;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
        
    }

    @Override
    public void onCollect()
    {
        StringBuilder sb = new StringBuilder(this.name);
        sb.append(',').append("size:").append(this.size());
        collector.collect(sb.toString());
    }
    
    @Override
    public boolean destroy()
    {
        this.clear();
        ControllableManager.unregister(this);
        return true;
    }

    @Override
    public Collector getCollector()
    {
        return this.collector;
    }

    @Override
    public void setCollector(Collector collector)
    {
        this.collector = collector;
    }

}
