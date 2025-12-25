package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {

        ArrayList<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("apple");
        input.add("orange");
        input.add("banana");

        // logic
        ArrayList<String> visited = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            String current = input.get(i);

            if (visited.contains(current)) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < input.size(); j++) {
                if (input.get(j).equals(current)) {
                    count++;
                }
            }

            // print the output
            System.out.println(current + " -> " + count);
            visited.add(current);
        }
    }
}
