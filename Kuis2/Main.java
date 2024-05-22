package Kuis2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedListTim list = new LinkedListTim();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan klub ke dalam list
        String[] clubNames = {
            "Prawira Harum Bandung", "Satria Muda Pertamina Jakarta", "Pelita Jaya Jakarta",
            "Dewa United Banten", "RANS PIK Basketball Club", "Bima Perkasa Jogja",
            "Bali United Basketball", "Bumi Borneo Basketball Pontianak", "Tangerang Hawks Basketball",
            "Indonesia Patriots", "Amartha Hangtuah Jakarta", "Evos Thunder Bogor",
            "West Bandits Solo", "Mountain Gold Timika", "Elang Pacific Caesar Surabaya",
            "Satya Wacana Salatiga"
        };

        for (String name : clubNames) {
            list.addTim(new Tim(name));
        }

        // Input hasil pertandingan
        String tim1, tim2, result;
        boolean exit = false;
        System.out.println("\nKlasemen IBL:");
        list.print();
        while (!exit) {
            System.out.println("\nMasukkan hasil pertandingan:");
            System.out.print("Tim 1: ");
            tim1 = scanner.nextLine();
            System.out.print("Tim 2: ");
            tim2 = scanner.nextLine();
            System.out.print("Hasil (Tim 1 menang - 'W', Tim 1 kalah - 'L'): ");
            result = scanner.nextLine();

            // Hilangkan tanda kutip yang mungkin disertakan pengguna
            tim1 = tim1.replace("\"", "").trim();
            tim2 = tim2.replace("\"", "").trim();
            result = result.replace("\"", "").trim();

            Tim timA = list.findtim(tim1);
            Tim timB = list.findtim(tim2);

            if (timA != null && timB != null) {
                if (result.equalsIgnoreCase("W")) {
                    timA.catatPertandingan(true);
                    timB.catatPertandingan(false);
                } else if (result.equalsIgnoreCase("L")) {
                    timA.catatPertandingan(false);
                    timB.catatPertandingan(true);
                } else {
                    System.out.println("Hasil tidak valid. Gunakan 'W' untuk menang atau 'L' untuk kalah.");
                }
            } else {
                System.out.println("Nama klub tidak ditemukan. Pastikan memasukkan nama klub dengan benar.");
            }

            // Pilihan untuk melanjutkan atau selesai
            System.out.print("Apakah Anda ingin melanjutkan input pertandingan? (ketik 'yes' untuk lanjut, 'no' untuk selesai): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                exit = true;
            }
        }

        // Mengurutkan dan menampilkan klasemen
        list.sorttims();
        System.out.println("\nKlasemen IBL:");
        list.print();
    }
}