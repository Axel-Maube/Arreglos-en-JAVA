/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package arreglosconjavaej3;

import java.util.Scanner;


public class ArreglosConJavaEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        System.out.println("");
        int[] vector = new int[n];
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;

        for (int i = 0; i < n; i++) {
           // vector[i] = (int) (Math.random() * 1 * 100000);
            //System.out.println(vector[i]);
            System.out.println("Ingrese el numero que quiere saber cuantos digitos tiene");
            vector[i]=leer.nextInt();
            if (vector[i] > 0 && vector[i] < 10) {
                System.out.println("El numero ingresado es de un digito");
                unDigito++;
        } else if (vector[i] > 9 && vector[i] < 100) {
                System.out.println("El numero ingresado es de dos digitos");
                dosDigitos ++;
        } else if (vector[i] > 99 && vector[i] < 1000) {
                System.out.println("El numero ingresado es de tres digitos");
                tresDigitos ++;
        } else if (vector[i] > 999 && vector[i] < 10000) {
                System.out.println("El numero ingresado es de cuatro digitos");
                cuatroDigitos ++;
        } else {
            System.out.println("El numero ingresado es de cinco digitos");
            cincoDigitos ++;
            } System.out.println("");
        }
        System.out.println("La cantidad de Numeros de un digito es " + unDigito);
        System.out.println("La cantidad de Numeros de dos digito es " + dosDigitos);
        System.out.println("La cantidad de Numeros de tres digitos es " + tresDigitos);
        System.out.println("La cantidad de Numeros de cuatro digitos es " + cuatroDigitos);
        System.out.println("La cantidad de Numeros de un cinco digitos es " + cincoDigitos);
    }

}
