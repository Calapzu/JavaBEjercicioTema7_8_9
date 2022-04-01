package com.ejercicio8;

import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        try {
            File origen = new File("origen.txt");
            escribirFichero(origen);

            File destino = new File("destino.txt");

            copiaDeFichero(origen, destino);
        }catch (IOException e){
            System.out.println("Ocurrio un error "+ e.getMessage());
        }



    }

    public static void escribirFichero(File origen) throws IOException {
        FileWriter escribir = new FileWriter(origen, true);

        for (int i = 0; i < 10; i++) {
            escribir.write("OpenBootCamp");
            escribir.write("\r\n");

        }

        escribir.close();
    }


    //InputStream y PrintStream
    public static void copiaDeFichero(File fileIn, File fileOut) throws IOException {

        InputStream in = new FileInputStream(fileIn);
        OutputStream out = new FileOutputStream(fileOut);

        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }

        in.close();
        out.close();

    }
}
