package org.example.module_3.abstraction.interfraces;

public class Ac implements Remote {
    public void turnOn() {
        System.out.println("ac turn on");
    }

    public void turnOff() {
        System.out.println("ac turn off");
    }
}