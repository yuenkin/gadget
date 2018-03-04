/*
 * 文件名：ChainContext.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.chainengine;

import java.util.List;

import com.hw.pps.gadget.chainengine.client.CltSession;
import com.hw.pps.gadget.chainengine.model.HandleNode;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2018年3月2日
 * @see ChainContext
 * @since
 */
public class ChainContext
{ 
    @Getter @Setter
    private Throwable lastExecuteError;
    
    @Getter @Setter
    private HandleNode currentHandleNode;
    
    @Getter
    private ChainSession session;
    
    @Getter @Setter
    private List<CltSession> cltSessions;
    
    public ChainContext(ChainSession session)
    {
        this.session = session;
    }
    
    
    
   

}
