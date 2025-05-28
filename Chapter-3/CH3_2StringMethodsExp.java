package com.Rahulaghan;

public class CH3_2StringMethodsExp {
    public static void main(String[] args){
        String name = "Rahul";
        int value = name.length();                        //1.String.length()
        String lstring = name.toLowerCase();              //2.String.toLowerCase()
        String ustring = name.toUpperCase();              //3.String.toUpperCase()
        System.out.println("Length of string: "+value);
        System.out.println("String in Lowercase: "+lstring);
        System.out.println("String in Uppercase: "+ustring);

        String trimexp = "   Rahul   ";                   //4.String.toLowerCase()
        System.out.println("String is trim: "+trimexp.trim());

        System.out.println("substring is: "+name.substring(2));         //5.String.substring(int start)
        System.out.println("start to end substring is: "+name.substring(1,4));                      //6.String.substring(int start, int end)
        System.out.println("New replaced string: "+name.replace('u','o'));          //7.String.replace('old','New')
        System.out.println("New replaced string is :"+name.replace("hul","kesh")); //7.1.String.replace
        System.out.println("The name is starts with given string or not: "+name.startsWith("Ra"));    //8.String.startsWith("Ra") True
        System.out.println("The name is ends with given string or not: "+name.endsWith("ul"));    //9.String.endsWith("ul") True
        System.out.println("The char at given place: "+name.charAt(3));                //10.String.charAt(int)
        System.out.println("The string is given place: "+name.indexOf("ul"));          //11.String.indexOf(str)
        System.out.println("The string at given place with int: "+name.indexOf("u",1));     //12.String.indexOf("str",int)
        System.out.println("The string at given last place: "+name.lastIndexOf("a"));                //13.String.lastIndexOf("str")
        System.out.println("The string at given last place with int: "+name.lastIndexOf("h",4));  //14.String.lastIndexOf("str",int)
        System.out.println("The string is equal or not for the given string: "+name.equals("Rahul"));    //15.String.equals("str")
        System.out.println("The string at equal or nor for the given string with no case sensitivity: "+name.equalsIgnoreCase("RaHuL")); //16.String.equalsIgnoreCase("str")

        //Escape Sequence Characters
        System.out.println("My name is Rahul, \"I am from Pen.\""); // char = \" or \' single or double quote ke liye
        System.out.println("My name is Rahul, \nI am from Pen."); // char = \n new line ke liye
        System.out.println("My name is Rahul, \tI am from Pen."); // char = \t tab ke liye
        System.out.println("My name is Rahul, \\I am from Pen."); // char = \\ agar backslash dena hoga to
    }
}
