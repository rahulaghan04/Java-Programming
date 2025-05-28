package com.Rahulaghan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class CH16_5FileHandling {
    public static void main(String[] args) {
        //Code to create a new File.
        /*File myfile = new File("CH16Exp.txt");
        try{
            myfile.createNewFile();
        }
        catch (Exception e){
            System.out.println("Unable to create this file: "+e);
        }*/

        //Code to write to a file.
        /*try{
            FileWriter fileWriter = new FileWriter("CH16Exp.txt");
            fileWriter.write("This is my first file in intellij Idea.\nOk bye.");
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Unable to write in the file: "+e);
        }*/

        //Reading a File.
        /*File myfile = new File("CH16Exp.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("This file is not found."+e);
        }*/

        //Deleting the File.
        File myfile = new File("CH16Exp.txt");
        if(myfile.delete()){
            System.out.println("I have deleted: "+myfile.getName());
        }
        else {
            System.out.println("Some problem occurred deleted the file.");
        }
    }
}
