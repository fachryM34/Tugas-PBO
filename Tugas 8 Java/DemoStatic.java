

package variabelStatic;

public class DemoStatic {
  // Deklarasi static Variabel
  private static String nama;
  private static int daya;

  public static void main(String[] args){
    /**
     * Inisialisasi variabel nama dan daya,
     * Menampilkan nama dan daya lampu
     */
    nama = "Bohlam";
    daya = 4;
    System.out.println("Nama lampu\t\t: " + nama);
    System.out.println("Daya tahan lampu\t: " + daya + " Bulan");
   }
}
