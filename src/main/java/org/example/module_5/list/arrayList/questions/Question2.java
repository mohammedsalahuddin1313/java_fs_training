package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(4);
        input.add(9);
        input.add(1);
        input.add(7);
        input.add(9);


        // logic
        int largest = 0;
        int secondLargest = 0;

        for (int num : input) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }


        // print the output
        System.out.println("Second largest element: " + secondLargest);
    }
}
