/*Contoh membaca interger menggunakan scanner*/
package tugas.tugas_java;
import java.util.Scanner;

public class Tgs3_Program4 {

    public static void main(String[] args) {
    // TODO Auto-generated method stub

    /* Kamus */
    int a;
    /* Program */
    Scanner masukan = new Scanner(System.in);
    System.out.print("Contoh membaca dan menulis, ketik nilai integer: ");
    a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ;
    Apa akibatnya ?*/
    System.out.print ("Nilai yang dibaca : "+ a);
 }
    
}
 

