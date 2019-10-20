package com.hblg.ch10.demo03;

import com.hblg.ch10.demo01.Parcel;

/**
 * @author i
 * @create 2019/9/24 22:09
 * @Description
 */
public class Parcel3 {

    static class Student{

        public Student get(){
            return new Student();
        }
    }

    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLable(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        //Student = Student.get();
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("xx");

    }
}
