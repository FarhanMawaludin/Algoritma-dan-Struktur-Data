# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Farhan Mawaludin </p>
<p align = "center"> NIM   : 2341720258 </p>
<p align = "center"> Prodi : TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas : 1B </p>
<br><br>

<h2>1.1 Langkah-langkah Percobaan</h2>

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
