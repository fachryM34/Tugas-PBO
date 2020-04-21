/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_new;
import java.util.Scanner;

/**
 *
 * @author fachryM34
 */
public class deklarasi_nilai {
         public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       int[] array = new int[10];
       int sum = 0,a;
       
       System.out.print("Masukan Jumlah bilangan : ");
       a = scanner.nextInt();
       
       System.out.print("Masukan nilai yang akan dijumlahkan : ");
       for (int i=0; i<a; i++)
       {
        array[i] = scanner.nextInt();
       }
       for( int num : array) {
           sum = sum+num;
       }
       System.out.println("Jumlah Dari Semua Elemen Array Adalah :"+sum);
    }
}
