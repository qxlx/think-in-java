package com.hblg.operator;

import javax.swing.*;

/**
 * @author i
 * @create 2019/9/14 20:46
 * @Description
 *      ==对于基础数据类型比较的是数据大小是否相等
 *        但是对于引用数据类型 比较的就是对象的引用 也就是对象的地址值是否相等
 *
 */
public class Equivalence {

    public static void main(String[] args) {
        /*Integer integer = new Integer(10);
        Integer integer2 = new Integer(10);
        System.out.println(integer);
        System.out.println(integer2);
        System.out.println(integer==integer2);//flase
        System.out.println(integer.equals(integer2));*/
        Value value = new Value();
        Value value2 = new Value();
        value.i = value2.i = 10;
        System.out.println(value == value2);//比较的是对象的引用
        System.out.println(value.equals(value2));//false equals()默认比较的是引用  除非我们重写equals

    }

}

class Value{

    int i;

}