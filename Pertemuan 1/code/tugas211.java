import java.util.Scanner;

public class tugas211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan Menu");
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;

            case 2:
                hitungJarak();
                break;

            case 3:
                hitungWaktu();
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }

    static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai s : ");
        double s = input.nextDouble();
        System.out.print("Masukkan Nilai t : ");
        double t = input.nextDouble();

        double v = s / t;
        System.out.printf("Kecepatan adalah %.2f", v);

        input.close();
    }

    static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai v : ");
        double v = input.nextDouble();
        System.out.print("Masukkan nilai t : ");
        double t = input.nextDouble();

        double s = v * t;
        System.out.printf("Jarak adalah %.2f", s);

        input.close();
    }

    static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai s : ");
        double s = input.nextDouble();
        System.out.print("Masukkan nilai v : ");
        double v = input.nextDouble();

        double t = s / v;
        System.out.printf("Waktu adalah %.2f", t);

        input.close();
    }
}
