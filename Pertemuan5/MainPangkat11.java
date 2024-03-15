// Class MainPangkat11
package Pertemuan5;
import java.util.Scanner;

public class MainPangkat11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen yang akan dihitung: ");
        int elemen = input11.nextInt();

        pangkat11[] png = new pangkat11[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int a = input11.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            int n = input11.nextInt();
            png[i] = new pangkat11(a, n);
        }

        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukan Pilihan :");
        int pilihan = input11.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF());
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC());
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
