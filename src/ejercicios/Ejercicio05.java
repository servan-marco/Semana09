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
public class Ejercicio05 {

    public static void main(String[] args) {

        //DECLARAR VARIABLE
        int i, j;
        String arrA, arrB, num, mA, mB, mC;
        int[] a, b, c;

        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese los numero del arreglo A: ");
        arrA = lectura.nextLine();

        System.out.print("Ingrese los numero del arreglo B: ");
        arrB = lectura.nextLine();

        System.out.println("");

        a = new int[5];
        num = "";

        for (i = 0, j = 0; i < arrA.length(); i++) {

            if (Character.isDigit(arrA.charAt(i))) {
                num += arrA.charAt(i);
            } else {
                a[j] = Integer.parseInt(num);
                j++;
                num = "";
            }
        }
        a[j] = Integer.parseInt(num);

        b = new int[5];
        num = "";

        for (i = 0, j = 0; i < arrB.length(); i++) {

            if (Character.isDigit(arrB.charAt(i))) {
                num += arrB.charAt(i);
            } else {
                b[j] = Integer.parseInt(num);
                j++;
                num = "";
            }
        }
        b[j] = Integer.parseInt(num);

        c = new int[10];
        for (i = 0, j = 0; i < 5; i++, j++) {
            c[i * 2] = a[i];
            c[j * 2 + 1] = b[i];

        }

        mA = "a[] = ";
        for (i = 0; i < a.length; i++) {
            mA += a[i] + " ";
        }

        mB = "b[] = ";
        for (i = 0; i < b.length; i++) {
            mB += b[i] + " ";
        }

        mC = "c[] = ";
        for (i = 0; i < c.length; i++) {
            mC += c[i] + " ";
        }

        //SALIDA DE DATOS
        System.out.println(mA);
        System.out.println(mB);
        System.out.println(mC);
    }

}
