package org.example.module_2.control_flow;

public class IfElse {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        String result = "";

        // if-else block
        if (a > b) {
            result = "a is greater than b";
        } else {
            result = "b is greater than a";
        }

        System.out.println(result);
    }
}
