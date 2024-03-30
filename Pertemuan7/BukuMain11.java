
import java.util.Scanner;

public class BukuMain11 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        
        pencarianBuku11 data = new pencarianBuku11() ;
        int jumBuku = 5;

        System.out.println("---------------------------------------");
        System.out.println("Masukan data buku secara urut dari kode buku terkecil : ");
        for (int i=0;i<jumBuku;i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul  Buku : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang : ");
            String pengarang = s1.nextLine();
            System.out.print("stok : ");
            int stok = s.nextInt();

            Buku11 m = new Buku11(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambahBuku(m);
        }

        System.out.println("---------------------------------------");
        System.out.println(" Data Keseluruhan Buku : ");
        data.tampilDataBuku();


        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println(" Pencarian Data : ");
        System.out.println("Masukan Kode BUku yang dicari : ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        data.TampilData(cari, posisi);

        Buku11 dataBuku11 = data.FindBuku(cari);
        dataBuku11.tampilDataBuku();

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println(" Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);




    }
}
