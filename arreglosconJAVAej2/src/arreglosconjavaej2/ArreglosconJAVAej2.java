/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package arreglosconjavaej2;

import java.util.Scanner;

public class ArreglosconJAVAej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Vector");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < (n); i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }

        System.out.println("Ingrese el numero que quiere buscar");
        int numABuscar = leer.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < n; i++) {
            if (numABuscar == vector[i]) {
                encontrado = true;
                System.out.println("El numero " + vector[i] + " fue encontrado en la posicion " + i);
            }

        }
        if (!encontrado) {
            System.out.println("El numero ingresado no fue encontrado");
        }
    }

}
