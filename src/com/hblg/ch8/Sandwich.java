package com.hblg.ch8;

import java.util.Scanner;

/**
 * @author i
 * @create 2019/9/22 19:37
 * @Description
 *    构造方法:1、先初始化当前类的 如果有直接父类 反复递归下去。
 *            2、按照声明吮吸调用成员的初始化方法
 *
 */
class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread{

    Bread(){
        System.out.println("Bread()");
    }

}

class Cheese{

    Cheese(){
        System.out.println("Cheese()");
    }

}

class Lunch extends  Meal{

    Lunch(){
        System.out.println("Lunch()");
    }

}


public class Sandwich  extends  Lunch{

    private Bread b = new Bread();
    private Cheese cheese = new Cheese();


    Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
