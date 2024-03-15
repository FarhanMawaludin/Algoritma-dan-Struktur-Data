// Class MainPangkat11
package Pertemuan5;
import java.util.Scanner;

public class MainPangkat11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen yang akan dihitung: ");
        int elemen = input11.nextInt();

        pangkat11[] png = new pangkat11[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int a = input11.nextInt();
            System.out.println("Masukkan nilai pangkat: ");
            int n = input11.nextInt();
            png[i] = new pangkat11(a, n);
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF());
        }

        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC());
        }
    }
}
