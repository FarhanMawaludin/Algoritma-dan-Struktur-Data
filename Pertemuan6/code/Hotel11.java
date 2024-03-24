public class Hotel11 {
    String nama;
    String kota;
    int harga;
    byte bintang;


    Hotel11(String n, String k, int h, Byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilAll(){
        System.out.println("Nama : " +nama);
        System.out.println("Kota : " +kota);
        System.out.println("Harga : Rp."+harga);
        System.out.println("Bintang : " +bintang);

    }
}
