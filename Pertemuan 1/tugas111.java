import java.util.Scanner;
public class tugas111 {
    public static void main(String[] args) {
        Scanner input11=new Scanner(System.in);

        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N','T' };
        String[][] kota = {{"BANTEN","JAKARTA","BANDUNG","CIREBON","BOGOR","PEKALONGAN","SEMARANG","SURABAYA","MALANG","TEGAL"}};

        System.out.print("Masukan Kode Plat : ");
        char  plat = input11.next().charAt(0);

        int index = -1;
        for (int i = 0; i < kode.length; i++) {
            if (plat == kode[i]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Kota dengan kode plat " + plat + " adalah : " );
            for (int j = 0; j < kota.length; j++) {
                System.out.println(kota[j][index]);
            }
        } else {
            System.out.println("Kode plat tidak valid.");
        }


        
    }
}
