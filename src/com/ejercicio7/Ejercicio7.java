package com.ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            dividePorCero(5, 0);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }

    }
    public static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado =  0;
        try {
            resultado = a/b;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
}
