package com.Rahulaghan;

import java.util.ArrayList;

public class CH16_4Generics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("str1");
        arrayList.add(78);
        arrayList.add(34);

        int a = (int)arrayList.get(2);
        System.out.println(a);
    }
}
