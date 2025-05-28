package com.Rahulaghan;

import java.time.Clock;
import java.time.DayOfWeek;

public class CH15_6Time {
    public static void main(String[] args) {
        System.out.println("No of Milliseconds since 1900 are: "+System.currentTimeMillis());
        System.out.println("No of Seconds since 1900 are: "+System.currentTimeMillis()/1000);
        System.out.println("No of Minutes since 1900 are: "+System.currentTimeMillis()/1000/3600);
        System.out.println("No of Hours since 1900 are: "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("No of Years since 1900 are: "+System.currentTimeMillis()/1000/3600/24/365);
    }
}
