import java.util.Scanner;

public class pemilihan11{
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");

        System.out.print("Masukan Nilai Tugas: ");
        int nilaiTugas = input11.nextInt();

        System.out.print("Masukan Nilai Kuis: ");
        int nilaiKuis=input11.nextInt();

        System.out.print("Masukan Nilai UTS: ");
        int NilaiUTS=input11.nextInt();

        System.out.print("Masukan Nilai UAS: ");
        int nilaiUAS=input11.nextInt();

        if (nilaiTugas >= 0 && nilaiTugas <= 100
                && nilaiKuis >= 0 && nilaiKuis <= 100
                && NilaiUTS >= 0 && NilaiUTS <= 100
                && nilaiUAS >= 0 && nilaiUAS <= 100) {

            
            double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * NilaiUTS + 0.3 * nilaiUAS;
            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if(nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("=========================");
            System.out.println("=========================");

            
            if (nilaiAkhir >= 60) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }

        } else {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai tidak valid.");
            System.out.println("=========================");
            System.out.println("=========================");
        }
    }
}
