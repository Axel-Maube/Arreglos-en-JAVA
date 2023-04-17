/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
correctos, es decir, están entre el 1 y el 9.

 */
package arreglosconjavaej6;

import java.util.Scanner;

public class ArreglosconJavaEj6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num = 0;
        int diaPri = 0;
        int diaOpu = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Rellene el cuadrado magico en la posicion " + i + "-" + j);
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] <= 0 || matriz[i][j] >= 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = num + matriz[i][j];
                if (i == j) {
                    diaPri += matriz[i][j];
                }
                if ((i + j) == 2) {
                    diaOpu += matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
        }
        System.out.println("");
        if ((num / 3) == diaOpu && (num / 3) == diaPri) {
            System.out.println("El cuadrado es magico");

        } else {
            System.out.println("El cuadrado no es magico");
        }

    }

}
