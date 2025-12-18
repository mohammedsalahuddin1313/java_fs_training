package org.example.module_3.polymorphism.run_time;

public class Main {
    public static void main(String[] args) {
        SubClass1 obj = new SubClass1();
        obj.myFunc();

        // run time polymorphism
        ParentClass obj1 = new SubClass1();
        obj1.myFunc();

        ParentClass obj2 = new SubClass2();
        obj2.myFunc();
    }
}