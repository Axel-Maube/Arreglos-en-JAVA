/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se 
obtiene cambiando sus filas por columnas (o viceversa).

 */
package arreglosconjavaej4;

import java.util.Scanner;

public class ArreglosConJavaEj4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {

                System.out.print("[" + matriz[k][j] + "]");
            }
            System.out.println(" ");
        }

    }

}
