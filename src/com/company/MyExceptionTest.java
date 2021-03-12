package com.company;

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyCheckException("details");
        } catch (MyCheckException e) {
            e.printStackTrace();
        }
        //throw new MyUnCheckException("some text");
    }
}
