
import java.util.Scanner;

public class konversi_waktu {
    public static void main(String[] args){
       
        int detik,menit,jam,menit2,detik3;
        float jam2,menit3,jam3,detik2;
        
        Scanner keyboard = new Scanner(System.in);
        
        /*menghitung satuan jam ke menit dan detik*/
        System.out.print("Masukan Satuan Jam : ");
        jam = keyboard.nextInt();
        
        detik = jam*3600;
        menit = jam*60;
        
        System.out.print(jam + "Jam adalah " + detik + "detik dan " + menit + "menit\n1");
   
        /*Menghtung satuan menit ke jam dan detik*/
        System.out.print("Masukan Satuan Menit : ");
        menit2 = keyboard.nextInt();
        
        detik2 = menit2*60;
        jam2 = menit2/60;
        
        System.out.print(menit2 + "Menit Adalah " + detik + "Detik dan "+ jam2 + "Jam\n");
        
        /*Menghitung satuan detik ke menit dan jam*/
        System.out.print("Masukan Satuan Detik : ");
        detik3 = keyboard.nextInt();
        
        menit3 = detik3/60;
        jam3 = detik3/3600;
        
        System.out.print(detik3 + "Detik Adalah "+ menit3 + "Menit Dan "+ jam3 + "Jam");
    }
    
}
