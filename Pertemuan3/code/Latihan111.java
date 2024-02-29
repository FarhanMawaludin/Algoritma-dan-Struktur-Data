package Pertemuan3.code;
import java.util.Scanner;
public class Latihan111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Bangun Ruang Kerucut Yang Ingin dihitung : ");
        kerucut11[] krc = new kerucut11[input11.nextInt()];
       
        
        for (int i = 0 ; i < krc.length; i++) {
            krc[i] = new kerucut11();
            System.out.print("Masukan jari-jari : ");
            krc[i].jari = input11.nextInt();
            System.out.print("Masukan sisi miring : ");
            krc[i].sisiMiring=input11.nextInt();
            input11.nextLine();

        }

        for (int i = 0 ; i < krc.length; i++) {
        System.out.println("luas permukaan kerucut " + krc[i].hitungLuasKerucut() + " dan Volume Kerucut " + krc[i].hitungVolumeKerucut());
        }
        

        System.out.print("Masukan Jumlah Bangun Ruang Limas Yang Ingin dihitung : ");
        limasSegiEmpat11[] lms = new limasSegiEmpat11[input11.nextInt()];
        for (int i = 0 ; i < lms.length; i++) {
            lms[i] = new limasSegiEmpat11();
            System.out.print("Masukan sisi alas : ");
            lms[i].panjangSisiAlas = input11.nextInt();
            System.out.print("Masukan tinggi limas : ");
            lms[i].tinggi=input11.nextInt();
            input11.nextLine();
            
        }

        for (int i = 0 ; i < lms.length; i++) {
            System.out.println("luas permukaan Limas " + lms[i].hitungLuasLimas() + " dan Volume Limas " + lms[i].hitungVolumeLimas());
            } 

            System.out.print("Masukan Jumlah Bangun Ruang Bola Yang Ingin dihitung : ");
            bola11[] bl = new bola11[input11.nextInt()];
            for (int i = 0 ; i < bl.length; i++) {
                bl[i] = new bola11();
                System.out.print("Masukan jari-jari : ");
                bl[i].jari = input11.nextInt();
            }
    
            for (int i = 0 ; i < bl.length; i++) {
                System.out.println(" luas permukaan bola " + bl[i].hitungLuasBola() + " dan volume Bola " + bl[i].hitungVolumeBola());
                } 


    }
    
}
