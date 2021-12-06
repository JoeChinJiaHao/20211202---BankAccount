package com.example;

import java.sql.Date;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.Date;  

public class TestDate {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date(0);  

        //using local date time
        System.out.println("Using LocalDateTime method");
        System.out.println(now);
        System.out.println(dtf.format(now));
        System.out.println(java.time.LocalDate.now());
        //using SimpleDateFormat
        /* System.out.println("Using SimpleDateTime method");
        System.out.println(formatter.format(date));
 */
    }
}
