package Pertemuan3.code;
import java.util.Scanner;
public class MahasiswaMain11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukan data mahasiswa yang ingin dimasukan : " );
        int data = input11.nextInt();

        Mahasiswa11[] mhs = new  Mahasiswa11[data];

        for (int i = 0 ; i < mhs.length; i++){
            mhs[i] = new Mahasiswa11();
            System.out.println("Masukan data mahasiswa ke - " + (i+1));
            System.out.print("Masukan nama :");
            mhs[i].nama = input11.next();
            System.out.print("Masukan NIM : ");
            mhs[i].nim = input11.next();
            System.out.print("Masukan Jenis Kelamin : ");
            mhs[i].jenisKelamin=input11. next().charAt(0);
            System.out.print("Masukan IPK : ");
            mhs[i].ipk= input11.nextDouble();
        }

        for(int i = 0 ; i <mhs.length;i++){
            System.out.println("Data mahasiswa ke - " + (i+1));
            System.out.println("nama : " + mhs[i].nama);
            System.out.println("nim : " + mhs[i].nim);
            System.out.println("Jenis kelamin : " + mhs[i].jenisKelamin);
            System.out.println("Nilai IPK : " + mhs[i].ipk);
        }

        System.out.println("rata-rata IPK : " + mhs[0].rataIPK(mhs));
        mhs[0].ipkTertinggi(mhs);

    }

}
