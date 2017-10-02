/*
 * 文件名：PPSPatternConverter.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.hw.pps.gadget.log4j2;

import java.util.Arrays;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2017年10月2日
 * @see PPSPatternConverter
 * @since
 */
@Plugin(name = "PPSPatternConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"PPS", "pps"})
public class PPSPatternConverter extends LogEventPatternConverter
{
    
    private final String[] options;
    
    public static PPSPatternConverter newInstance(final String[] options) 
    {
        return new PPSPatternConverter(options);
    }

    protected PPSPatternConverter(final String[] options)
    {
        super("PPS", "pps");
        this.options = options == null ? null : Arrays.copyOf(options, options.length);
    }

    @Override
    public void format(LogEvent event, StringBuilder toAppendTo)
    {
        if (null != options)
        {
            for (int i = 0; i < options.length; i++)
            {
                if (i > 0)
                {
                    toAppendTo.append("|");
                }
                
                toAppendTo.append(null == Log4j2Context.get(options[i]) ? "" : Log4j2Context.get(options[i]));
                
            }
        }
        
    }
    
}
