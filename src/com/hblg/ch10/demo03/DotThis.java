package com.hblg.ch10.demo03;

/**
 * @author i
 * @create 2019/9/24 21:49
 * @Description
 */
public class DotThis {

    void  f(){
        System.out.println("DotThis.f()");
    }

    public class Inner{
        public DotThis outer(){
            //如果你需要生成对外部类对象的引用，可以使用外部类的名字后面.this
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        System.out.println("dt:"+dt);
        DotThis.Inner dti = dt.inner();
        System.out.println("dti:"+dti);
        dti.outer().f();//通过内部类获取外部类对象 调用外部类对象的实例化方法
    }

}
