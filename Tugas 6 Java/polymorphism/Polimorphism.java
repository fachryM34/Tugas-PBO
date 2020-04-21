/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author fachryM34
 */
public class Polimorphism {
    public static void main(String[ ] args) {
 
      cetakObyek(new Balok());
      cetakObyek(new PersegiPanjang());
      cetakObyek(new BangunDatar());
      cetakObyek(new Object());
   }
    
   public static void cetakObyek(Object obyek) {
      System.out.println(obyek);
   }
 
} // Akhir kelas Polimorphism
 
class Balok extends PersegiPanjang {
   public String toString() {
      return "Mempunyai sisi panjang, lebar dan tinggi";
   }
}
 
class PersegiPanjang extends BangunDatar {
   public String toString() {
      return "Mempunyai sisi panjang dan lebar";
   }
}
 
class BangunDatar extends Object {
   public String toString() {
      return "Mempunyai berbagai bentuk";
   }
}
