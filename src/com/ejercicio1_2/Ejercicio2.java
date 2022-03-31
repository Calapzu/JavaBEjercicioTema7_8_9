package com.ejercicio1_2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] arrayBidimensional = new int[][]{
                {1,3,5,7},
                {2,4,6,8},
                {-1,-2,-3-4}
        };

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j<arrayBidimensional[i].length; j++) {
                System.out.println("Esta en la fila ["+i+"] columna ["+j+"] y el elemento que hay en esa posicion es: "
                +arrayBidimensional[i][j]);
            }
        }
    }
}
