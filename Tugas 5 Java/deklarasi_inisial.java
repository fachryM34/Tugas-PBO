/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_new;

/**
 *
 * @author feelix
 */
public class deklarasi_inisial {
    public static void main (String[ ] args)
{
int [ ] [ ] bilangan = {
{1, 5, 2, 9, 7},
{2, 9, 5, 8, 9},
{34, 17, 10, 89, 67},
{14, 71, 24, 92, 10}
};

// Menampilkan nilai array
for (int i = 0; i < 4; i++)
{
for(int j = 0; j < 5; j ++)
System.out.print (bilangan[i][j] + "");
System.out.println();
}
}
    
}
