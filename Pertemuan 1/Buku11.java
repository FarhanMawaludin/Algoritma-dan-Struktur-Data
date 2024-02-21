public class Buku11 {

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
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok habis, tidak dapat melakukan penjualan.");
        }
    }

    
    void restock(int jml) {
        stok += jml;
    }

    
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
}


