package Pertemuan5;

import java.util.Scanner;
public class MainFaktorial11 {
    public static void main(String[] args) {

        Scanner input11 = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Masukan Jumlah Elemen: ");
        int ijml = input11 . nextInt();

        faktorial11[] fk = new faktorial11[ijml];
        for (int i = 0 ; i < fk.length ; i++){
            fk[i]= new faktorial11();
            System.out.println("Masukan nilai data ke-" +(i+1) + " :");
            fk[i].nilai = input11.nextInt();

        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < fk.length
        ; i++){
            System.out.println(" Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i = 0; i < fk.length
        ; i++){
            System.out.println(" Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialDC(fk[i].nilai));
        }

    }
    
}
