package com.example.demo.common.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @Author zlj
 * @Description 日志注解
 * @Date 2022/10/21
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface OpLog {
    @AliasFor("type")
    String value() default "";
 
    @AliasFor("value")
    String type() default "";
}
