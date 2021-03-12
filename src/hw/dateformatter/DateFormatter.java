package hw.dateformatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the date in ISO format");
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        LocalDate localDate = LocalDate.parse(date);

        System.out.println("Enter the format of the date :THROUGHSLASH,\n" +
                "    THROUGDASH,\n" +
                "    THROUGHDOTS,\n" +
                "    MONTHBYLETTERS,\n" +
                "    YEARIN2DIGITS ;\n");

        String line = reader.readLine();
        Enum enums = Enum.valueOf(line);
        switch (enums){
            case THROUGHSLASH:  setThroughSlash(localDate);break;
            case THROUGDASH: setThroughDash(localDate); break;
            case THROUGHDOTS: setThroughDots(localDate);break;
            case MONTHBYLETTERS: setMonthByLetters(localDate);break;
            case YEARIN2DIGITS: setYear2Digits(localDate);break;
            default : throw new IllegalStateException("Error , try again later") ;

        }

    }
    static public void setThroughSlash(LocalDate localDate){
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(localDate));
    }
    static public void setThroughDash (LocalDate localDate){
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(formatter.format(localDate));
    }
    static public void setThroughDots(LocalDate localDate){
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(formatter.format(localDate));
    }
    static public void setMonthByLetters(LocalDate localDate){
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(formatter.format(localDate));
    }
    static public void setYear2Digits(LocalDate localDate){
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(formatter.format(localDate));
    }


}
