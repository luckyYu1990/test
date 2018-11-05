package com.example.springboot;

public class Singleton {
    private Singleton(){};
    private static class SingletonHolder{
        private static Singleton singleton = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }
}
