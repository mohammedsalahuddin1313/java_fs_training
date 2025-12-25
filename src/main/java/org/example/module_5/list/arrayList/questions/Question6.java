package org.example.module_5.list.arrayList.questions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(4);

        Set<Integer> mergedSet = new LinkedHashSet<>();
        mergedSet.addAll(arr1);
        mergedSet.addAll(arr2);

        ArrayList<Integer> mergedList = new ArrayList<>(mergedSet);

        System.out.println(mergedList);
    }
}