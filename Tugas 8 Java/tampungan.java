
package getteAndsetter;
class tampungan {
    
    private int nidn;
    private String namadosen;
    private String jurusan;
    private String fakultas;
    private String email;
    
    //Sebagai constructor nya / melist tampungan
    public tampungan(){
		}
		
    //Untuk menampung valuenya
    public tampungan(int nidn, String namadosen, String jurusan, String fakultas, String email){
        this.nidn = nidn;
        this.namadosen = namadosen;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.email = email;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getNamadosen() {
        return namadosen;
    }

    public void setNamadosen(String namadosen) {
        this.namadosen = namadosen;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
