package com.example.demo.utils;

/**
 * @author zlj
 * @Des TODO
 * @Date 2022/3/30 10:11
 **/
@FunctionalInterface
public interface BeanUtilsCallBack<S,T> {
    void callBack(S t, T s);
}
