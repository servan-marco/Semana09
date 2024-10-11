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
public class Programa03 {

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int i, n;
        double sueldo, smy, sp, st;
        double[] sempleados;

        Scanner lectura = new Scanner(System.in);

        //ENTRADA DE DATOS
        System.out.print("Ingresar cantidad de empleados: ");
        n = lectura.nextInt();
        sempleados = new double[n];
        //PROCESO DE DATOS
        for (i = 0; i < sempleados.length; i++) {
            System.out.print("Ingresar sueldo del empleado " + (i + 1) + ": ");
            sueldo = lectura.nextDouble();
            sempleados[i] = sueldo;
        }

        smy = 0;
        st = 0.0;
        for (i = 0; i < n; i++) {
            st += sempleados[i];
            if (sempleados[i] > smy) {
                smy = sempleados[i];
            }
        }
        sp = st / sempleados.length;
        System.out.println("");

        //SALIDA DE DATOS
        System.out.println("El sueldo promedio es: " + sp);
        System.out.println("El sueldo mayor es: " + smy);
    }
}
