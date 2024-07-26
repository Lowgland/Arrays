/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosparesimparesarrays;

/**
 *
 * @author thelo
 */
import java.util.Scanner;
public class NumerosParesImparesArrays {
    
public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
    
      int[] num = new int[10];

        
     for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número");
            num[i] = teclado.nextInt();
        }
   int[] resultado = (num);
        System.out.println("Cantidad de números pares: " + resultado[0]);
        System.out.println("Cantidad de números impares: " + resultado[1]);
    }

    public static int[] num(int[] num) {
      int numpar = 0;
       
      int numimpar = 0;

        for (int numero : num) {
            if (numero % 2 == 0) {
                numpar++;
            } else {
                numimpar++;
            }
        }
     return new int[]{numpar, numimpar};
    }
}


