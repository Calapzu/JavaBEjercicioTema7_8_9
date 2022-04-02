package com.ejercicio9;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listaNombres = new ArrayList<String>();

        int contador = 0;
        int cantidadnombres = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos nombres va a insertar"));

        while (contador != cantidadnombres) {
            listaNombres.add(JOptionPane.showInputDialog("Digite el nombre [" + (contador + 1) + "]: "));
            contador++;
        }

        String nombreArchivo = JOptionPane.showInputDialog("Digite el nombre que le quiere dar al archivo") + ".txt";

        try {
            escribirFichero(listaNombres, nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrio un problema" + e);
        }

        lecturaDeFichero(nombreArchivo);
    }

    public static void escribirFichero(ArrayList<String> texto, String nombre) throws IOException {
        File file = new File(nombre);
        FileWriter escribir = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(escribir);
        PrintWriter pw = new PrintWriter(bw);

        String temporal = "";
        FileReader lector = new FileReader(nombre);
        BufferedReader lectorLinea = new BufferedReader(lector);

        for (int i = 0; i < texto.size(); i++) {
            pw.write(texto.get(i) + "\n");
        }

        bw.close();
        pw.close();
    }

    public static void lecturaDeFichero(String nombreArchivo) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}


