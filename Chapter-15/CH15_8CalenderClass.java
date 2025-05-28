package com.Rahulaghan;

import java.text.DateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.*;

public class CH15_8CalenderClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //getInstance()

        /*System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTimeZone().getID());*/

        //Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        //System.out.println(calendar.getCalendarType());      //getCalendarType()
        //System.out.println(calendar.getTimeZone().getID());  //getTimeZone().getID()
        //System.out.println(calendar.getFirstDayOfWeek());    //getFirstDayOfWeek()

        /*calendar.add(Calendar.DATE,20);                      //add(int field, int amount)
        System.out.println("20 days Later: "+calendar.getTime());
        calendar.add(Calendar.MONTH, -2);
        System.out.println("2 Month ago: "+calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 Year Later: "+calendar.getTime());*/

        /*Calendar pastCalendar = Calendar.getInstance();
        System.out.println("Current Date: "+calendar.getTime());
        pastCalendar.set(Calendar.YEAR,2019);
        System.out.println("Year is: "+pastCalendar.get(Calendar.YEAR));
        Date time = pastCalendar.getTime();
        if(!pastCalendar.after(calendar)){                   //after(Object when)
            System.out.println("Date "+time+" is before current date.");
        }*/

        /*Calendar futureCalendar = Calendar.getInstance();
        System.out.println("Current Date: "+calendar.getTime());
        futureCalendar.set(Calendar.YEAR,2022);
        System.out.println("Year is: "+futureCalendar.get(Calendar.YEAR));
        Date time = futureCalendar.getTime();
        if(futureCalendar.before(calendar)){                   //before(Object when)
            System.out.println("Date "+time+" is before current date.");
        }*/

        /*Calendar calendar1 = Calendar.getInstance();
        int val = calendar1.compareTo(calendar);               //compareTo(Calendar anotherCalendar)
        System.out.println("The Comparison result is: "+val);
        System.out.println(calendar.equals(calendar));*/       //equals(Object obj)

        //System.out.println(calendar.get(1));                 //get(int field)
        //System.out.println(calendar.getActualMaximum(11));   //getActualMaximum(int field)
        //System.out.println(calendar.getActualMinimum(5));    //getActualMinimum(int field)

        /*System.out.println("All available calendar types: ");
        Set<String> set = Calendar.getAvailableCalendarTypes(); //getAvailableCalendarTypes()
        set.forEach(System.out::println);*/

        //System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.US)); //getDisplayName(int field, int style, Locale locale)
        //System.out.println(calendar.getDisplayNames(Calendar.DATE,Calendar.LONG,Locale.GERMANY));  //getDisplayNames(int field, int style, Locale locale)
        //System.out.println(calendar.getGreatestMinimum(Calendar.DAY_OF_WEEK)); //getGreatestMinimum(int field)

        /*Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT")); //getInstance(TimeZone zone)
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        if(calendar1.equals(calendar2)){
            System.out.println("Both are equals.");
        }
        else {
            System.out.println("They are not equals.");
        }*/

        /*Calendar cal = Calendar.getInstance(new Locale("Pa")); //getInstance(Locale aLocale)
        Calendar cal1 = Calendar.getInstance(Locale.CHINESE);
        if(!cal.equals(cal1)){
            System.out.println("Both are not equals.");
        }
        else {
            System.out.println("They are equals.");
        }*/

        //System.out.println(calendar.getLeastMaximum(Calendar.MINUTE)); //getLeastMaximum(int field)
        //System.out.println(calendar.getMaximum(Calendar.DATE));   //getMaximum(int field)
        //System.out.println(calendar.getMinimalDaysInFirstWeek()); //getMinimalDaysInFirstWeek()
        //System.out.println(calendar.getMinimum(Calendar.MONTH));  //getMinimum(int field)
        //System.out.println(calendar.getTime());                   //getTime()
        //System.out.println(calendar.getTimeInMillis());           //getTimeInMillis()
        //System.out.println(calendar.getWeeksInWeekYear());        //getWeeksInWeekYear()
        //System.out.println(calendar.getWeekYear());               //getWeekYear()
        //System.out.println(calendar.hashCode());                  //hashCode()
        //System.out.println(calendar.isSet(Calendar.MINUTE));      //isSet(int field)
        //System.out.println(calendar.isLenient());                 //isLenient()
        //System.out.println(calendar.isWeekDateSupported());       //isWeekDateSupported()
        //calendar.roll(Calendar.YEAR,true);                        //roll(int field, boolean up)
        //calendar.roll(Calendar.MINUTE, 23);                       //roll(int field, int amount)

        calendar.set(Calendar.YEAR,2022);                           //set(int field, int value)
        System.out.println(calendar.getTime());

        calendar.set(2023,11,25);                  //set(int year, int month, int date)
        System.out.println(calendar.getTime());

        calendar.set(2024,11,25,3,50); //set(int year, int month, int date, int hourOfDay, int minute)
        System.out.println(calendar.getTime());

        calendar.set(2025,8,15,8,30,45); //set(int year, int month, int date, int hourOfDay, int minute, int second)
        System.out.println(calendar.getTime());

        calendar.setFirstDayOfWeek(Calendar.MONDAY);            //setFirstDayOfWeek(int value)
        System.out.println(calendar.getFirstDayOfWeek());

        calendar.setMinimalDaysInFirstWeek(4);            //setMinimalDaysInFirstWeek(int value)
        System.out.println(calendar.getMinimalDaysInFirstWeek());

        calendar.setTimeInMillis(30000);                  //setTimeInMillis(long millis)
        System.out.println(calendar.getTimeInMillis());

        System.out.println("The Original Timezone is: "+calendar.getTimeZone().getDisplayName());
        TimeZone timeZone = TimeZone.getTimeZone("GMT");  //setTimeZone(TimeZone value)
        calendar.setTimeZone(timeZone);
        System.out.println("New Timezone is: "+calendar.getTimeZone().getDisplayName());

        calendar.setWeekDate(2024,5,2); //setWeekDate(int weekYear, int weekOfYear, int dayOfWeek)
        System.out.println(calendar.getTime());

        calendar.set(Calendar.MONTH,Calendar.JULY);
        calendar.set(Calendar.DATE,25);
        calendar.set(Calendar.YEAR,2022);
        Date date = calendar.getTime();
        System.out.println("Original date is: "+date.toString());   //toString()
        Instant ist = date.toInstant();                             //toInstant()
        System.out.println("Instant date is: "+ist);
    }
}
