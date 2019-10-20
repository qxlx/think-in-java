package com.hblg.ch8;

/**
 * @author i
 * @create 2019/9/22 19:03
 * @Description
 *      继承模型 就类型与鸡蛋模型 子类是大鸡蛋，内部包含父类 小鸡蛋；但是只能访问到父类中的公共的作用域和方法
 *    因此 就包含 父类类型 指向了子类类型 属于多态的范畴。
 */

class Super{

    public int field = 0;

    public int getField(){
        return field;
    }

}

class Sub extends  Super{

    public int field = 1;

    public int getField(){
        return field;
    }

    public int getSuperField(){
        return super.getField();
    }

}

public class FiledAccess {

    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = "+sup.field);
        System.out.println("sup.getField = "+sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field = "+sub.field);
        System.out.println("sub.getField = "+sub.getField());
        System.out.println("sub.super.getSuperField ="+sub.getSuperField());
    }

}
