package com.hblg.ch8;

import javax.swing.text.html.ListView;
import java.util.LinkedList;

/**
 * @author i
 * @create 2019/9/22 19:46
 * @Description
 */
class Characteristic{

    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic "+s);
    }

    protected void dispose(){
        System.out.println("disposing Characteristic "+s);
    }
}

class Description{

    private String s;

    Description(String s){
        this.s  = s;
        System.out.println("Creating Description "+s);
    }

    protected void dispose(){
        System.out.println("disposing Description "+s);
    }
}

class LivdingCreature{

    private Characteristic p = new Characteristic(" is alive");
    private Description t = new Description("Basic Living Creature");

    LivdingCreature(){
        System.out.println("LivingCreature");
    }

    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivdingCreature{

    private Characteristic p = new Characteristic("has heart");

    private Description t = new Description("Animal not vegetable");

    Animal(){
        System.out.println("Animal");
    }

    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{

    private Characteristic p = new Characteristic("Can live in water");
    private Description t = new Description("Both water and land");

    Amphibian(){
        System.out.println("Amphibian");
    }

    protected void dispose(){
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog  extends  Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats bugs");

    public Frog(){
        System.out.println("Frog()");
    }

    protected void dispose(){
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye");
        frog.dispose();
    }
}
