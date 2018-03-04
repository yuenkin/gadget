/*
 * 文件名：CltSession.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月4日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.chainengine.client;

import com.hw.pps.gadget.chainengine.ChainSession;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2018年3月4日
 * @see CltSession
 * @since
 */
@Getter @Setter
public class CltSession
{
    private long startTime;
    private Throwable exception;
    private ChainSession chainSession;
    private CltRequestEvent<?> cltRequestEvent;
    private CltResponseEvent<?> cltResponseEvent;

}
