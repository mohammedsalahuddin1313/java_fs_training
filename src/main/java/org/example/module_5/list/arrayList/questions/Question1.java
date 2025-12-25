package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(10);
        input.add(30);
        input.add(20);

        // logic
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (!output.contains(input.get(i))) {
                output.add(input.get(i));
            }
        }


        // print the output
        System.out.println(output);
    }
}