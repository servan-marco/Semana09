/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edct this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int i, n;
        double compras, ct, cp, cmy, cmr;
        double[] cpersonas;

        Scanner lectura = new Scanner(System.in);

        //ENTRADA DE DATOS
        System.out.print("Ingresar cantidad de personas: ");
        n = lectura.nextInt();
        cpersonas = new double[n];
        //PROCESO DE DATOS
        for (i = 0; i < cpersonas.length; i++) {
            System.out.print("Ingrese las compras de la persona " + (i + 1) + ": ");
            compras = lectura.nextDouble();
            cpersonas[i] = compras;
        }

        cmy = cmr = cpersonas[0];
        ct = 0.0;
        for (i = 0; i < n; i++) {
            ct += cpersonas[i];
            if (cpersonas[i] > cmy) {
                cmy = cpersonas[i];
            }
            if (cmr > cpersonas[i]) {
                cmr = cpersonas[i];
            }
        }
        cp = ct / cpersonas.length;
        System.out.println("");

        //SALIDA DE DATOS
        System.out.println("Las compras totales es: " + ct);
        System.out.println("Las compras promedio es: " + cp);
        System.out.println("La compra mayor es: " + cmy);
        System.out.println("La compra menor es: " + cmr);
    }
}
