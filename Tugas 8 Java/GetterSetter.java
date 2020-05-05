
package getteAndsetter;


public class GetterSetter {

   public static void main(String[] args) {
         tampungan objek = new tampungan();
         objek.setNidn(1302018);
         objek.setNamadosen("Mardiyyah Hasnawi.,S.Kom");
         objek.setJurusan("Teknik Informatika");
         objek.setFakultas("Ilmu Komputer");
         objek.setEmail("mardiyyah.hm@gmail.com");
         
         System.out.println("NIDN = " + objek.getNidn());
         System.out.println("Nama Dosen = " + objek.getNamadosen());
         System.out.println("Jurusan = " + objek.getJurusan());
         System.out.println("Fakultas = " + objek.getFakultas());
         System.out.println("Email = " + objek.getEmail());
    }
    
}
