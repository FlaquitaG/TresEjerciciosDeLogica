package com.test.ejerciciosDeLogica.impl;
import java.util.Scanner;

public class ProcesamientoCadenaDeCaracteres {


    public String leerDelTeclado(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres: ");
        String text = scan.nextLine();
        System.out.println("Cadena: " + text);

    return text;
    }

    public void MandarLongitud(String text){

        String[] arr = text.split(" ");
        int i = arr.length;
        String ultimaPalabra;
        System.out.println("Ultima palabra: " + arr[i-1] );
        ultimaPalabra = arr[i-1];
        System.out.println("Longitud Ultima palabra es: " + ultimaPalabra.length());


    }

}
