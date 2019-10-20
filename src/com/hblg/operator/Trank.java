package com.hblg.operator;

/**
 * @author i
 * @create 2019/9/14 20:31
 * @Description 对象变量引用
 *
 */
public class Trank {

    int level;

    public static void main(String[] args) {
        Trank trank = new Trank();
        Trank trank2 = new Trank();
        trank.level = 10;
        trank2.level = 20;

        System.out.println("trank:"+trank.level+"  trank2:"+trank2.level);// 10  20

        trank = trank2;

        System.out.println("trank:"+trank.level+"  trank2:"+trank2.level);// 20  20

        trank2.level = 30;
        System.out.println("trank:"+trank.level+"  trank2:"+trank2.level);// 30  30
    }

}
