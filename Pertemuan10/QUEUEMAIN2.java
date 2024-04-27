package Pertemuan10;


import java.util.Scanner;

public class QUEUEMAIN2 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        Scanner sc111 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc11.nextInt();

        QUEUE211 Q = new QUEUE211(jumlah);

        int pilih = 0;
        do {
            Q.menu();
            pilih = sc11.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sc111.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc111.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc111.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc11.nextInt();
                    System.out.print("Saldo : ");
                    int saldo = sc11.nextInt();
                    nasabah11 nb = new nasabah11(norek, nama, alamat, umur, saldo);
                    Q.Enqueue(nb);
                    break;
                case 2:
                    nasabah11 data = Q.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.PeekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

