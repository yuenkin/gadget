/*
 * 文件名：CltResponseEventHandler.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月4日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.chainengine.handler.impl;

import com.hw.pps.gadget.chainengine.ChainEngine;
import com.hw.pps.gadget.chainengine.client.CltResponseEvent;
import com.hw.pps.gadget.chainengine.handler.EventHandler;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2018年3月4日
 * @see CltResponseEventHand ler
 * @since
 */
public class CltResponseEventHandler implements EventHandler<CltResponseEvent<?>>
{

    @Override
    public void handleEvent(CltResponseEvent<?> event)
    { 
        ChainEngine.resume(event.getCltSession().getChainSession().getSessionId());
    }

}
