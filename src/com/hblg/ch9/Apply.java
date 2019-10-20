package com.hblg.ch9;

import java.util.Arrays;

/**
 * @author i
 * @create 2019/9/23 19:45
 * @Description
 */

class Processor{

    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }
}

class Upcase extends Processor{

    String process(Object input){
        return ((String)input).toUpperCase();///转换大写
    }

}

class Downcase extends  Processor{

    String process(Object input){
        return ((String)input).toLowerCase();//转换小写
    }

}

class Splitter extends Processor{

    String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }

}

public class Apply {

    public static String s = "A B C";

    public static void process(Processor processor,Object s){
        System.out.println("Using Processor "+processor.name());
        System.out.println(processor.process(s));
    }

    public static void main(String[] args) {
        process( new Upcase(),s);
        process( new Downcase(),s);
        process( new Splitter(),s);
    }
}
