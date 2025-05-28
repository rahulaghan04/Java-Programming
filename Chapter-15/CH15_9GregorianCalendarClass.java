package com.Rahulaghan;

import java.util.Calendar;
import java.util.*;

public class CH15_9GregorianCalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));

        GregorianCalendar gCalender = new GregorianCalendar();
        System.out.println(gCalender.isLeapYear(2029));  //isLeapYear()
        System.out.println(TimeZone.getAvailableIDs()[20]);
        System.out.println(TimeZone.getAvailableIDs()[41]);
        System.out.println(TimeZone.getAvailableIDs()[72]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getAvailableIDs()[155]);


    }
}
