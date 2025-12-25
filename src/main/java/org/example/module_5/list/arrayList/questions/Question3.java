package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("Java");
        input.add("Python");
        input.add("C++");
        input.add("JavaScript");
        input.add("Ruby");


        // logic
        int start = 0;
        int end = input.size() - 1;

        while (start < end) {
            String temp = input.get(start);
            input.set(start, input.get(end));
            input.set(end, temp);

            start++;
            end--;
        }



        // print the output
        System.out.println(input);
    }
}