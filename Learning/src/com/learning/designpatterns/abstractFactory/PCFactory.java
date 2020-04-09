package com.learning.designpatterns.abstractFactory;


public class PCFactory implements AbstractFactory {

    private String ram;
    private  String hdd;

    private  String cpu;


    public PCFactory(String r, String h, String c){
        this.ram = r;
        this.hdd = h;
        this.cpu = c;
    }

    public Computer createComputer(){
        return  new PC(ram,hdd,cpu);
    }
}
