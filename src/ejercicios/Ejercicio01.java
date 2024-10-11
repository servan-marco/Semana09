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
public class Ejercicio01 {

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int i, n;
        double peso, pp, pt;
        double[] ppersonas;

        Scanner lectura = new Scanner(System.in);

        //ENTRADA DE DATOS
        System.out.print("Ingresar cantidad de personas: ");
        n = lectura.nextInt();
        ppersonas = new double[n];
        //PROCESO DE DATOS
        for (i = 0; i < ppersonas.length; i++) {
            System.out.print("Ingresar peso del empleado " + (i + 1) + ": ");
            peso = lectura.nextDouble();
            ppersonas[i] = peso;
        }

        pt = 0.0;
        for (i = 0; i < ppersonas.length; i++) {
            pt += ppersonas[i];
        }
        pp = pt / ppersonas.length;
        System.out.println("");

        //SALIDA DE DATOS
        System.out.println("La peso promedio es: " + pp);
    }
}
