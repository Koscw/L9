package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyUsing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/yaroslav/Desktop/Sometext.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);

        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(reader!=null)
            reader.close();
        }

    }
}
