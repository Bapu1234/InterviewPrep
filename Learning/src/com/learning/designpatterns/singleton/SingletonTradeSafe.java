package com.learning.designpatterns.singleton;


public class SingletonTradeSafe {

    private static SingletonTradeSafe instance;

    private SingletonTradeSafe(){}

    public static synchronized SingletonTradeSafe getInstance(){
        if(instance == null){
            instance = new SingletonTradeSafe();
        }
        return  instance;
    }
}
