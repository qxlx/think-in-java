package com.hblg.ch10.demo01;

/**
 * @author i
 * @create 2019/9/24 21:20
 * @Description
 */
public class Parcel {

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
        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("xxxx");
    }
}
