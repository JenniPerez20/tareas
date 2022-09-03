

package com.mycompany.ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner nom = new Scanner (System.in);
        System.out.println("Ingrese un Nombre");
        
        String nombre = nom.nextLine();
        
        System.out.println("\n Buenos Dias " + nombre);
    }
}
