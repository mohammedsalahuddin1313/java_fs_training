package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Logic
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        // Print the output
        System.out.println("After removing even numbers: " + numbers);
    }
}
