/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package arreglos.conjavaej5;

import java.util.Scanner;

public class ArreglosConJAVAEj5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int c = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese los valores de la Matriz Original");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("-----------------original-------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("-----------------transpuesta-------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == matriz[j][i]) {
                    c = c + 1;
                }
            }
        }

        if (c == 9) {
            System.out.println("la matriz es antisimetrica");
        } else {
            System.out.println("la matriz no es antisimetrica");
        }
    }
}
