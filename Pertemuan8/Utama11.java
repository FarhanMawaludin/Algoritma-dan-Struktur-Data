package Pertemuan8;
import java.util. Scanner;

import Pertemuan3.code.segitiga11;
public class Utama11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Masukan Kapasitas Gudang: ");
        int kap = input11.nextInt();
        Gudang11 gudang = new Gudang11(kap);
       

        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat Barang Teratas");
            System.out.println("4. Tampilkan Barang Tumpukan");
            System.out.println( "5. Keluar Program");
            System.out.print("Pilih Operasi : ");
            int pilihan = input11.nextInt();
            
            switch (pilihan){
                case 1 :
                System.out.print("Masukan Kode Barang : ");
                int kode = input11.nextInt();
                System.out.print("Masukan Nama Barang : ");
                String nama = input11.next();
                System.out.print("Masukan Nama Kategori : ");
                String kategori = input11.next();
                Barang11 barangBaru = new Barang11(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                 break;

                 case 2:
                 gudang.ambilBarang();
                 break;

                 case 3:
                 gudang.lihatBarangTeratas();
                 break;

                 case 4:
                 gudang.tampilBarang();;
                 break;

                 case 5:
                 break;

                 default:
                 System.out.println("pilihan tidak valid!!!");
            }
        }

    }
    
}
