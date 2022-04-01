package com.ejercicio5_6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Sudamerica");
        arrayList.add("Europa");
        arrayList.add("Asia");
        arrayList.add("Africa");

        System.out.println("ArrayList");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println();
        System.out.println("LinkedList");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
}
