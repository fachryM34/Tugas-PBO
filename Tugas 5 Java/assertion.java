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
public class assertion {
    public static void main(String args[]) {
    int age;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("masukan umur anda :");
    age = input.nextInt();
    
    assert(age>0);
    /* jika masukan umur benar (misal, age>0) */
    if (age >= 18) {
    System.out.print("kamu sudah remaja");
    }
    
    }
}