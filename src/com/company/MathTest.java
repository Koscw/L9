package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BrokenBarrierException;

public class MathTest {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer number1 = Integer.parseInt(reader.readLine());
            Integer number2 = Integer.parseInt(reader.readLine());

            Integer result = number1 / number2;
            System.out.println(result);
        }// catch (/*Exception e */ IOException e ){
         //   System.out.println("some exception happen "+e.getClass().getName()+" : "+ e.getMessage());
            catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
            catch (IOException e){
                System.out.println("Io error");
            }
            catch (ArithmeticException e){
            System.out.println("Do not divide on zero");

            }
            catch (Exception e){
                System.out.println("Exception!");
            }

    }
}
