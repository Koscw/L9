package com.company;

import javax.sound.sampled.FloatControl;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate date = LocalDate.of(2000,2,3);
        System.out.println(date );
        LocalDate anotherdate = LocalDate.parse("1983-03-07")  ;
        System.out.println(anotherdate);

        System.out.println(anotherdate.getMonth());

        System.out.println(anotherdate.isAfter(date));
        LocalTime time= LocalTime.now();
        System.out.println(time);
        LocalTime time1= LocalTime.of(11,17);
        System.out.println(time1);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse("2020-01-01T06:00:00");
        System.out.println(localDateTime1);

        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yy MM dd")));

        ZoneId zoneId = ZoneId.of("CET");
        ZonedDateTime zonedDateTime=ZonedDateTime.of(2021,3,10,0,9,3,20,ZoneId.systemDefault());
        System.out.println(zoneId);
        System.out.println(zonedDateTime);

        LocalDate initialDate = LocalDate.now();
        LocalDate finalDate =initialDate.plus(Period.ofDays(5));
        LocalTime localTime = LocalTime.now();

    }
}
