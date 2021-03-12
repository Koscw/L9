package hw;

import java.io.*;

public class SafeCopy {
    static public void copyFile(String file1, String file2) throws IOException {
        String s;
        FileReader a = new FileReader(file1);
        BufferedReader q = new BufferedReader(a);
        FileWriter b = new FileWriter(file2);
        BufferedWriter t = new BufferedWriter(b);
        while ((s = q.readLine()) != null) {
            t.write(s);
            t.newLine();
            System.out.println("Copied successfuly");
            t.flush();
        }
        q.close();
        t.close();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the files ");
            copyFile(reader.readLine(), reader.readLine());
        } catch (FileNotFoundException exception) {
            System.out.println("Error");
            System.out.println("Enter both files one more time");
            copyFile(reader.readLine(), reader.readLine());
        }
    }

}
