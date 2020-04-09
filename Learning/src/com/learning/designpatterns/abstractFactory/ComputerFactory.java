package com.learning.designpatterns.abstractFactory;


public class ComputerFactory {

    public static Computer getComputer(AbstractFactory fact){
        return fact.createComputer();
    }
}
