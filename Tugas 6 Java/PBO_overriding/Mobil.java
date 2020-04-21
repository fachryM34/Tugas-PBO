/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_overriding;

/**
 *
 * @author feelix
 */
public class Mobil extends Kendaraan {
   //overriding method
    void bergerak(){
    System.out.println("Mobil bergerak");
    }

    public static void main (String args[]){
    //Membuat objek mobil
    Mobil mobil = new Mobil();
    //Objek mobil menggunakan method bergerak()
    mobil.bergerak();
}
    
}    

