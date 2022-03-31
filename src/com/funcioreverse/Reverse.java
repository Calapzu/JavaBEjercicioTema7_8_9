package com.funcioreverse;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
    }

    public static String reverse(String texto) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(texto.charAt(i));
        }
        return cadenaInvertida.toString();
    }
}
