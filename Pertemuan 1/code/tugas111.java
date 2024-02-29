import java.util.Scanner;
public class tugas111 {
    public static void main(String[] args) {
        Scanner input11=new Scanner(System.in);

        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N','T' };
        char[][] kota = {
            { 'B', 'A', 'N', 'T', 'E', 'N' },
            { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
            { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
            { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
            { 'B', 'O', 'G', 'O', 'R' },
            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
            { 'M', 'A', 'L', 'A', 'N', 'G' },
            { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukan Kode Plat : ");
        char  plat = input11.next().charAt(0);

        int index = -1;
        for (int i = 0; i < kode.length; i++) {
            if (plat == kode[i] ) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Kota yang sesuai dengan kode plat " + plat + " adalah: ");
            for (int i = 0; i < kota[index].length; i++) {
                System.out.print(kota[index][i]);
            }
        } else {
            System.out.println("Kode plat tidak valid.");
        }


        
    }
}
