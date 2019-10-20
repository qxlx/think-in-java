package com.hblg.ch10.demo02;

/**
 * @author i
 * @create 2019/9/24 21:32
 * @Description
 */
public interface Selector {

    boolean end();

    Object current();

    void next();
}
