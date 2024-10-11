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
public class Programa04 {

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int i, n;
        double venta, vmr, vp, vt;
        double[] vvendedor;

        Scanner lectura = new Scanner(System.in);

        //ENTRADA DE DATOS
        System.out.print("Ingresar cantidad de vendedores: ");
        n = lectura.nextInt();
        vvendedor = new double[n];
        //PROCESO DE DATOS
        for (i = 0; i < vvendedor.length; i++) {
            System.out.print("Ingresar venta del empleado " + (i + 1) + ": ");
            venta = lectura.nextDouble();
            vvendedor[i] = venta;
        }

        vmr = vvendedor[0];
        vt = 0.0;
        for (i = 0; i < vvendedor.length; i++) {
            vt += vvendedor[i];
            if (vmr > vvendedor[i]) {
                vmr = vvendedor[i];
            }
        }
        vp = vt / vvendedor.length;
        System.out.println("");

        //SALIDA DE DATOS
        System.out.println("Las ventas totales es: " + vt);
        System.out.println("La venta promedio es: " + vp);
        System.out.println("La venta menor es: " + vmr);
    }
}
