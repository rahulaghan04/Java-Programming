package com.Rahulaghan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CH15_11DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        //System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //26-12-2023
        DateTimeFormatter dtf0 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //26/12/2023
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyya E"); //26-12-2023pm Tue
        DateTimeFormatter dtf2 = DateTimeFormatter.BASIC_ISO_DATE;          //20231226
        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_DATE;                //2023-12-26
        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;           //2023-12-26T18:25:01.8186976
        DateTimeFormatter dtf5 = DateTimeFormatter.ISO_LOCAL_DATE;          //2023-12-26
        DateTimeFormatter dtf6 = DateTimeFormatter.ISO_TIME;                //18:41:12.1757315
        DateTimeFormatter dtf8 = DateTimeFormatter.ISO_WEEK_DATE;           //2023-W52-2
        DateTimeFormatter dtf9 = DateTimeFormatter.ISO_ORDINAL_DATE;        //2023-360
        String myDate = dt.format(dtf9);
        System.out.println(myDate);
    }
}
