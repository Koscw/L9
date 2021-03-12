package hw.userio;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class UserIO {
    public static void main(String[] args) throws IOException {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("1 - reading ");
        System.out.println("2 - recording ");
        int input = parseInt(scannerInput.nextLine());
        ObjectOutputStream out;
        try {
            switch (input) {
                case 1 : {
                    try {

                        readFile(scannerInput.next());
                    } catch (FileNotFoundException exception) {
                        System.out.println("No files found ");
                        readFile(scannerInput.next());
                    }
                }
                case 2 : {
                    System.out.println("Enter the data: name, age , city");
                    String name = scannerInput.nextLine();
                    String age = scannerInput.nextLine();
                    String city = scannerInput.nextLine();


                    User user = new User(name, parseInt(age), city);

                    System.out.println("Enter the file name");
                    String source = scannerInput.nextLine();
                    File file = new File(("/Users/yaroslav/Desktop/Users"+source+".txt"));
                    out = new ObjectOutputStream(new FileOutputStream(file));
                    out.writeObject(user.toString());
                    out.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static public void readFile(String source)throws IOException{

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        try{
            reader=new BufferedReader(new FileReader(source));
        }catch(FileNotFoundException exception){
            System.out.println("Try again");
            String newSource = reader.readLine();
            readFile(newSource);
        }
        String line=reader.readLine();
        System.out.println(line);

    }
}
