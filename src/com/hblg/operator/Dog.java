package com.hblg.operator;

/**
 * @author i
 * @create 2019/9/14 20:53
 * @Description
 */
public class Dog {

    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("spot","Ruff");
        Dog dog2 = new Dog("scruffy","Wurf");
    }

}
