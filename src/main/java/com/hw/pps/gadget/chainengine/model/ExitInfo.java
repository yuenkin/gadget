/*
 * 文件名：ExitInfo.java
 * 版权：Copyright by www.yuenkin.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年3月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.chainengine.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "exitInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExitInfo
{ 
    @XmlElement(name = "exitName")
    private String exitName;
    
    @XmlElement(name = "value")
    private String value;
}
