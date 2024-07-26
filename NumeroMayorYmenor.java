/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromayorymenor;

/**
 *
 * @author thelo
 */
import java.util.Arrays;
import java.util.Scanner;
public class NumeroMayorYmenor {

    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
     int[] num = new int[8];
 

        
     for (int i = 0; i < 8; i++) {
            System.out.print("Ingresa un numero");
            num[i] = teclado.nextInt();
            
        }
     
        int mas = Arrays.stream(num).max().orElseThrow();
        int menor = Arrays.stream(num).min().orElseThrow();
        
        System.out.println("El numero mayor es" + mas);
        System.out.println("El numero menor es" + menor);
        
        
    }

}