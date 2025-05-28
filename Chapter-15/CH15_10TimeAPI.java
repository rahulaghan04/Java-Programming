package com.Rahulaghan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CH15_10TimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
//IMP date classes
//1. LocalDate
//2. LocalTime
//3. LocalDateTime
//4. DateTimeFormatter