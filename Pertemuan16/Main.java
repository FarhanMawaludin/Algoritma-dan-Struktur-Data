package Pertemuan16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    private static List<Nilai> daftarNilai = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initSampleData();
        boolean exit = false;
        
        while (!exit) {
            System.out.println("*************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("*************************************");
            System.out.print("Pilih: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void initSampleData() {
        // Sample Mahasiswa
        daftarMahasiswa.add(new Mahasiswa("20001", "Thalia", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20005", "Bilal", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        // Sample MataKuliah
        daftarMataKuliah.add(new MataKuliah("0001", "Internet of Things", 2));
        daftarMataKuliah.add(new MataKuliah("0002", "Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah("0003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah("0005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    private static void inputNilai() {
        System.out.print("Masukkan kode mata kuliah: ");
        String kodeMK = scanner.nextLine();
        MataKuliah mk = null;
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            if (mataKuliah.getKode().equals(kodeMK)) {
                mk = mataKuliah;
                break;
            }
        }
        if (mk == null) {
            System.out.println("Mata kuliah tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        Mahasiswa mhs = null;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                mhs = mahasiswa;
                break;
            }
        }
        if (mhs == null) {
            System.out.println("Mahasiswa tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        daftarNilai.add(new Nilai(mhs, mk, nilai));
        System.out.println("Nilai berhasil ditambahkan.");
    }

    private static void tampilNilai() {
        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            System.out.println(nilai);
        }
    }

    private static void cariNilaiMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        int totalSKS = 0;
        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            if (nilai.getMahasiswa().getNim().equals(nim)) {
                System.out.println(nilai);
                totalSKS += nilai.getMataKuliah().getSks();
            }
        }
        System.out.println("Total SKS yang telah diambil: " + totalSKS);
    }

    private static void urutDataNilai() {
        daftarNilai.sort((n1, n2) -> Double.compare(n2.getNilai(), n1.getNilai()));
        System.out.println("Data nilai telah diurutkan.");
        tampilNilai();
    }
}
