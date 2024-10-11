/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int i, n;
        String persona, mensaje;
        String[] npersona;

        Scanner lectura = new Scanner(System.in);

        //ENTRADA DE DATOS
        System.out.print("Ingresar cantidad de personas: ");
        n = lectura.nextInt();
        npersona = new String[n];
        //PROCESO DE DATOS
        for (i = 0; i < npersona.length; i++) {
            System.out.print("Ingresar el nombre de la persona " + (i + 1) + ": ");
            persona = lectura.next();
            npersona[i] = persona;
        }
        System.out.println("");

        System.out.print("Ingresar la persona a buscar: ");
        persona = lectura.next();

        mensaje = "No existe la persona";
        for (i = 0; i < n; i++) {
            if (npersona[i].equalsIgnoreCase(persona)) {
                mensaje = "Si existe la persona";
                break;
            }
        }

        //SALIDA DE DATOS
        System.out.println("");
        System.out.println("mensaje = " + mensaje);
        System.out.println("La persona " + npersona[i] + " esta en la posicion " + (i + 1));
    }
}