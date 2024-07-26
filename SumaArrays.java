/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumaarrays;

/**
 *
 * @author thelo
 */
import java.util.Scanner;

public class SumaArrays {

    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
     int[] num = new int[5];
     int suma = 0;

        
     for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa un numero");
            num[i] = teclado.nextInt();
            suma += num[i];
        }
        System.out.println("El resultado de la suma es:" + suma);
    }

}