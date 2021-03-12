package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackTraceTest2 {
    public static void main(String[] args) throws IOException {

        method1();
        System.out.println("after method1");
    }

    private static void method1() throws IOException {
        method2();
        System.out.println("after method2");
    }

    private static void method2() throws IOException {
        method3();
        System.out.println("after method3");
    }

    private static void method3() throws IOException {
        method4();
        System.out.println("after method4");
    }

    private static void method4() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            input= reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("after exception");
        if (input.equals("throw")) {
            throw new RuntimeException("my exception ");
        }

    }
}
