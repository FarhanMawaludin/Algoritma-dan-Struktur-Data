package Pertemuan5;
import java.util.Scanner;
public class MainPangkat11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.println("Masukan jumlah elemen yang akan dihitung: ");
        int elemen = input11.nextInt();

        pangkat11[] png = new pangkat11[elemen];
        for  (int i=0 ;i<png.length;i++){
            png[i] = new pangkat11();
            System.out.println("Masukan nilai yang hendak dipangkatkan : ");
            png[i].nilai=input11.nextInt();
            System.out.println("Masukan nilai pangkat : ");
            png[i].pangkat=input11.nextInt();
        }

        System.out.println("HASIL PANGKAT - BRUTE  FORCE");
        for (int i = 0 ; i<png.length; i++){
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat) );
        }

        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0 ; i<png.length; i++){
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat) );
        }
    }
}
