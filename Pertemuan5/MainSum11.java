package Pertemuan5;
import java.util.Scanner;

public class MainSum11 {
    public static void main(String[] args) {
        Scanner input11= new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("Program menghitung keuntungan total ( Satuan Juta. Misal 5.9)");
        System.out.print("Masukan Jumlah Bulan : ");
        int elemen = input11.nextInt();

        sum11 sm = new sum11(elemen);
        System.out.println("=============================================================");
        for (int i = 0; i<sm.elemen; i++) { 
            System.out.print("Masukan untung bulan ke-" + (i+1)+ " : ");
            sm.keuntungan[i]= input11.nextDouble();
        }

        System.out.println("=============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("=============================================================");
        System.out.println("Algoritma Divide Conquer");
        double totalDC = sm.totalDC(sm.keuntungan, 0, sm.elemen-1);
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + String.format("%.2f", totalDC));
    }
    }
