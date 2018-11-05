package com.example.springboot;

public class A extends AbstractA {
    @Override
    public String say(String str) {
        this.run();
        return null;
    }

    public String yes(){
        return "";
    }

    public static void main(String[] args){
        A a = new A();
        a.say("");
    }
}
