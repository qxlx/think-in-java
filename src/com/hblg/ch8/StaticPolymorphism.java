package com.hblg.ch8;

/**
 * @author i
 * @create 2019/9/22 19:19
 * @Description  静态方法就不具备多态性。
 *      静态方法是与类，而并非与单个的对象相关联的。
 */
class StaticSuper{

    public static void staticGet(){
        System.out.println("StaticSuper ststiacGet()");
    }

    public void dynamicGet(){
        System.out.println("StaticSuper dynamicGet()");
    }
}

class StaticSub extends StaticSuper{

    public static void staticGet(){
        System.out.println("StaticSub staticGet()");
    }

    public void dynamicGet(){
        System.out.println("StaticSub dynamicGet()");
    }
}
public class StaticPolymorphism {

    public static void main(String[] args) {
        StaticSuper staticSuper = new StaticSub();
        staticSuper.staticGet();
        staticSuper.dynamicGet();
    }
}
