package com.Rahulaghan;

import java.time.LocalDate;
import java.util.Date;
public class CH15_7DateClass {
    public static void main(String[] args) {
        //Quick quiz
        //System.out.println(Long.MAX_VALUE);
        //System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        //next all are deprecated.
        System.out.println(date.getDate());
        System.out.println(date.getSeconds());
        System.out.println(date.getDay());
        System.out.println(date.getMinutes());
        System.out.println(date.getMonth());
        System.out.println(date.getHours());
        System.out.println(date.getYear());


    }
}
