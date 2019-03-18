package com.test.ejerciciosDeLogica;

import com.test.ejerciciosDeLogica.impl.ProcesamientoCadenaDeCaracteres;

public class Main {

    public static void main (String [] args){
        ProcesamientoCadenaDeCaracteres test1 = new ProcesamientoCadenaDeCaracteres();

        //test1.leerDelTeclado();
        test1.MandarLongitud(test1.leerDelTeclado());

    }
}
