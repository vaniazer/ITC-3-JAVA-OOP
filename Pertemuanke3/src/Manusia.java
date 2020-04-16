public class Manusia {
    String nama;
    String ktp;
    int umur;

    // overloading = nama dan tipe method sama, tapi parameter harus beda, isi program boleh beda
    // overriding = nama, tipe, dan parameter method sama, isi program boleh beda

    public Manusia(String nama){
        this.nama = nama;
    }

    public void makan(){
        System.out.println(" sedang makan");
    }

    //ini overloading
    public void makan(String nama){
        System.out.println( nama + " sedang makan");
    }

    //overloading juga
    public void makan(String nama, int umur){
        System.out.println( nama + " sedang makan dengan umur " + umur);
    }

    public void tidur(String nama){
        System.out.println(nama + " sedang tidur");
    }
}
