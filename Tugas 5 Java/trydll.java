package com.mycompany.java_new;

/**
 *
 * @author feelix
 */
public class trydll {
    public static void main(String[] args) 
    { 
        int a = 10, b = 5, c = 5, hasil; 
        try { 
            hasil = a / (b - c); 
            System.out.println("hasil" + hasil); 
        } 
  
        catch (ArithmeticException e) { 
            System.out.println("Eror karena pembagi hasilnya 0"); 
        } 
  
        finally { 
            System.out.println("akhir program"); 
        } 
    } 
}
