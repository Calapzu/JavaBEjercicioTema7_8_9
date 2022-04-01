package com.ejercicio5_6;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0){
                arrayList.remove(i);
            }
            System.out.println(arrayList.get(i) + "");
        }
    }
}
