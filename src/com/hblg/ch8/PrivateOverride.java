package com.hblg.ch8;

/**
 * @author i
 * @create 2019/9/22 18:56
 * @Description  覆盖私有方法 是不可行的。
 *  结论:只有非private方法可以被覆盖。
 */
public class PrivateOverride {

    private void f(){
        System.out.println("private() f");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride = new PrivateOverride();
        privateOverride.f();
    }
}

class Derived extends  PrivateOverride{

    public void f(){
        System.out.println("public() f");
    }

}