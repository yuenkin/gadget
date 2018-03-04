/*
 * 文件名：HandleChain.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.chainengine.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "chain")
@XmlAccessorType(XmlAccessType.FIELD)
public class HandleChain
{
    @XmlElement(name = "name")
    private String name;
    
    @XmlElementWrapper(name = "handleNodes")
    @XmlElement(name = "handleNode")
    private List<HandleNode> handleNodes;
}
