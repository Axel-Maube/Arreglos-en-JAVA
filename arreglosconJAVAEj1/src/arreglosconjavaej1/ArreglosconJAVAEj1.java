/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
 */
package arreglosconjavaej1;


public class ArreglosconJAVAEj1 {

   
    public static void main(String[] args) {
        int[] numeros = new int[101];
        
        for (int i=0;i<101;i++){
            numeros[i]=i;
        }
        for (int i=100;i>0;i--){
            System.out.println(numeros[i]);
        }
    }
}
