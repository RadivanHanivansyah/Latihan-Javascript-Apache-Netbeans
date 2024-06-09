/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanalgoritma;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;
import java.io.PrintStream;
/**
 *
 * @author HP
 */
public class LatihanAlgoritma {

    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        angka = input.nextInt();
        piramida(angka);
        
    }
    public static void piramida(int angka){
        for (int i = 1; i <= angka; i++) {
            for(int j=1*(angka-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
