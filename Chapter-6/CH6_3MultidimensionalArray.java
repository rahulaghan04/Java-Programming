package com.Rahulaghan;

public class CH6_3MultidimensionalArray {
    public static void main(String[] args) {
        int [][] flats;
        flats = new int [2][3]; //2-D array
        //Ground floor
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        //first floor
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;
        //System.out.println(flats[2][2]);
        for(int i=0; i<flats.length; i++){
            for(int k=0; k<flats[i].length; k++) {
                System.out.print(flats[i][k] + " ");
            }
            System.out.println("");
        }
    }
}
