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
public class Programa01 {

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int i, n, edad;
        double se, pe;
        Scanner lectura = new Scanner(System.in);

        //ENTRADA DE DATOS
        System.out.print("Ingresar cantidad de alumnos: ");
        n = lectura.nextInt();
        int[] edades;
        edades = new int[n];
        //PROCESO DE DATOS
        for (i = 0; i < n; i++) {
            System.out.print("Ingresar edad del alumno " + (i + 1) + ": ");
            edad = lectura.nextInt();
            edades[i] = edad;
        }

        se = 0;
        pe = 0.0;
        for (i = 0; i < n; i++) {
            se += edades[i];
        }
        pe = se / n;
        System.out.println("");
        //SALIDA DE DATOS
        System.out.println("El promedio de edades es: " + pe);
    }
}
