package com.ejercicio3_4;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();

        vector.add("Ingenieria de sistemas");
        vector.add("Biologia");
        vector.add("Ingenieria Agroecologica");
        vector.add("MVZ");
        vector.add("Ciencias Sociales");

        vector.remove(1);
        vector.remove(2);


        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

    }
}
