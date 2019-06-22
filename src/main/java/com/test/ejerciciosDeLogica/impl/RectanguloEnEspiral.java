package com.test.ejerciciosDeLogica.impl;

public class RectanguloEnEspiral {

    int BASE = 4;
    int BASE2= 4;
    int a = 0;
    int b = BASE;
    int [][]matrizEspiral = new int[BASE][BASE];
    int incremental = 0;
    int []contenido = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    int i, j = 0;
    boolean completo = true;

    public int[][] llenarMatriz() {
         // for (int i =0; i<BASE;i++) {
          //   for (int j = 0; j < BASE; j++) {
       // while (matrizEspiral [][]!= 0){

            for (i = a; i < b; i++) {
                matrizEspiral[j][i] = contenido[incremental++];
            }
            for (j = a+1; j < b; j++) {
                matrizEspiral[j][BASE - 1] = contenido[(incremental++)];
            }

            for (i = b-2; i >= 0; i--) {
                matrizEspiral[b-1][i] = contenido[incremental++];

            }

            for (j = b-2; j>=1; j--){
                matrizEspiral[j][0] = contenido[incremental++];
            }
         //  }
        //}
   // }
        return matrizEspiral;
    }

    public void imprimirMatri(int [][] llenarMatriz){

        for (int i =0; i<BASE;i++){
            for (int j=0; j<BASE; j++){
                System.out.print(matrizEspiral[i][j] + "       ");
            }
            System.out.println("");
        }

    }

}
