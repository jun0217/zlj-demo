package com.example.demo.utils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *@ClassName: SpringContextUtils
 *@Description: 实现 ApplicationContextAware 接口创建上下文工具类 SpringContextUtils
 *@Params:
 *@Return:
 *@Author xxw
 *@Date 2022/2/28
 */
@Component
public class SpringContextUtils implements ApplicationContextAware{
    private static ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.applicationContext = applicationContext;
        
    }
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) throws BeansException {
        if (applicationContext == null){
            return null;
        }
        return (T)applicationContext.getBean(name);
    }
}
