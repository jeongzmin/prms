package com.prms.util;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class LogbackFilter extends Filter<ILoggingEvent>{
    
	@Override
    public FilterReply decide(ILoggingEvent event) {    
    	if(event.getLoggerName().equals("org.springframework.test.context.cache")
    			|| event.getLoggerName().equals("org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener")
    			|| event.getLoggerName().equals("org.springframework.context.annotation.AnnotationConfigApplicationContext")
    			|| event.getLoggerName().equals("org.springframework.context.support.DefaultLifecycleProcessor")
//    			|| event.getLoggerName().equals("org.springframework.context.annotation.AnnotationConfigApplicationContext")
    			){
        	return FilterReply.DENY;
        }else {
            return FilterReply.ACCEPT;
        }
    }
}