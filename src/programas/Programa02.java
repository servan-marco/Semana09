/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Programa02 {

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int i, n, num, nbus;
        String mensaje;
        int[] anumeros;

        Scanner lectura = new Scanner(System.in);

        //ENTRADA DE DATOS
        System.out.print("Ingresar cantidad de numeros: ");
        n = lectura.nextInt();
        anumeros = new int[n];
        //PROCESO DE DATOS
        for (i = 0; i < anumeros.length; i++) {
            System.out.print("Ingresar numero " + (i + 1) + ": ");
            num = lectura.nextInt();
            anumeros[i] = num;
        }

        System.out.print("Ingresar el numero a buscar: ");
        nbus = lectura.nextInt();
        System.out.println("");

        mensaje = "No existe el numero";
        for (i = 0; i < n; i++) {
            if (nbus == anumeros[i]) {
                mensaje = "Si existe el numero";
                break;
            }
        }
        
        //SALIDA DE DATOS
        System.out.println("mensaje = " + mensaje);
    }
}
