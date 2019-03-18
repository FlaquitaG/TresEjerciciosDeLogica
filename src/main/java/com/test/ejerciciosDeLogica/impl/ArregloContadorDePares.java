package com.test.ejerciciosDeLogica.impl;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArregloContadorDePares {
    Scanner scan = new Scanner(System.in);
    int longitud;

    private int LeerLongitudDelArreglo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor introduce el tamanio del arreglo: ");
        longitud = scan.nextLine();

        return longitud;
    }

    public Array crearArreglo(int longitud){

        int[] arr = new Array();

        return arr;

    }

    public Array llenarArreglo(int[] arregloDeNumeros){
        int valor, i;
        System.out.println("Lenar arreglo: ");
        for (i = 0; i < arregloDeNumeros.length; i++){
            System.out.println("posicion ["+ i + "]" );
            valor = scan.nextLine();
            arregloDeNumeros[i]= valor;
        }

        return arregloDeNumeros;
    }

    public void imprimirValoresDelArreglo(int[] arregloDeNumeros){

    }
}
