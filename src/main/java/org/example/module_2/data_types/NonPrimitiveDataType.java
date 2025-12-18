package org.example.module_2.data_types;

public class NonPrimitiveDataType {
    public static void main(String[] args) {
        String name = "Dheeraj";
        System.out.println("Name: " + name);

        int[] array1 = {1,2,4,4,5};
        System.out.println("1st Array element at 0th index is :" + array1[0]);

        int[] array2 = new int[5];
        array2[3] = 20;
        System.out.println("2nd Array element at 3rd index is:" + array2[3]);

        String[] friends = new String[3];
        friends[0] = "Joy";
        friends[1] = "chanler";
        friends[2] = "Ross";

        enum Day {
            SUNDAY,
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY
        }

        Day today = Day.SATURDAY;
        System.out.println("Today is: " + today);


        Person obj = new Person(); // obj, obj is non primitive data type
        obj.greet();
    }
}

// class as non-primitive data type
class Person {
    String name;
    public void greet() {
        System.out.println("Person says hello!");
    }
}