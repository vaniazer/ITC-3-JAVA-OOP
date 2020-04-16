public class Mahasiswa extends Manusia implements Bernyanyi {
    //attribute
    private String nim;
    private double IPK;

    //modifier : public, private                                                              //protected, default
    public Mahasiswa(String nama, String nim, double IPK){
        super(nama);
        this.nim = nim;
        this.IPK = IPK;
    }

    //inheritance = bapak --> anak atau umum --> khusus
    //Misal MahkluhHidup --> Manusia --> Mahasiswa

    public String getNama(){
        return super.nama;

    }
    public void setNama(String nama){
        super.nama = nama;
    }

    public String getNim(){
        return nim;

    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public double getIPK(double IPK){
        return IPK;
    }

    public void setIPK(){
        this.IPK = IPK;
    }

    //method
    void belajar(){
        System.out.println("sedang belajar");
    }

    void doTugas(){
        System.out.println("ngerjain tugas");
    }

    public void tidur(String nama){
        super.tidur(nama + " tidur nyenyak di kamar");
    }

    @Override
    public void Bernada() {
        System.out.println(nama + " sedang bernyanyi");
    }

    @Override
    public void Berjoget(java.lang.String gerakan) {
        System.out.println("Joget" + gerakan);
    }
}
