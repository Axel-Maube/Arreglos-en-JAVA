/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package arreglosconjavaguiateoricaej1y2;

import java.util.Scanner;


public class ArreglosconJAVAGuiateoricaej1y2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[5];
        for (int i=0; i<5; i++){
        System.out.println("Ingrese el nombre del integrante del equipo");
        equipo[i]=leer.next();
        
        }
        
        System.out.println("El nombre del integrante es: ");
        for (int i=0;i<5;i++){
            System.out.print(equipo[i] + " ");
        }
        System.out.println("");
    }
    
}
