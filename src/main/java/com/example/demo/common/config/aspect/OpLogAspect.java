package com.example.demo.common.config.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * @author
 * @Des 日志切面
 * @Date 2022/10/21 15:39
 **/
@Aspect
@Component
public class OpLogAspect {
    
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    public final static List<String> excludeList = Arrays.asList("net.cnki.monitor.controller.LoginController.authLogin");
    
    @Pointcut("@annotation(com.example.demo.common.annotation.OpLog)")
    public void logPointCut() {
    }
    
    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        
        // 记录下请求内容
        logger.info("请求地址 : " + request.getRequestURL().toString());
        logger.info("HTTP METHOD : " + request.getMethod());
        // 获取真实的ip地址
        // logger.info("IP : " + IPAddressUtil.getClientIpAddress(request));
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());
        if (!excludeList.contains(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName())) {
            logger.info("参数 : " + Arrays.toString(joinPoint.getArgs()));
        }
        // logger.info("参数 : " + joinPoint.getArgs());
        
    }
    
    /**
     * returning的值和doAfterReturning的参数名一致
     * @param ret
     * @throws Throwable
     */
    @AfterReturning(returning = "ret", pointcut = "logPointCut()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容(返回值太复杂时，打印的是物理存储空间的地址)
        logger.debug("返回值 : " + ret);
    }
    
    
    @Around("logPointCut()")
    public Object Around(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        // ob 为方法的返回值
        Object ob = point.proceed();
        logger.info("耗时 : " + (System.currentTimeMillis() - startTime));
        return ob;
    }
}
