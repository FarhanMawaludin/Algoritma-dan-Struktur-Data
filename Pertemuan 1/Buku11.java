public class Buku11 {

    Buku11() {

    }
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Stok Tersedia: " + stok);
        System.out.println("Harga: Rp" + harga);
    }

    
    void terjual(int jml) {
        stok -= jml;
    }

    
    void restock(int jml) {
        stok += jml;
    }

    
    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku11(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok=stok;
        harga=har;
    }
  
    
}

