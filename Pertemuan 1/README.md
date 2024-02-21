Nama : Farhan Mawaludin
NIM : 2341720258
Kelas : 1-B
Mata Kuliah : Algoritma dan Struktur Data

2.1.1 Langkah-langkah Percobaan
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
        stok -= jml;
    }


    void restock(int jml) {
        stok += jml;
    }


    void gantiHarga(int hrg) {
        harga = hrg;
    }

}
