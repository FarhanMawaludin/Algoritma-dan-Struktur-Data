import java.util.Scanner;
public class perulangan11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner (System.in);

        System.out.print("Masukan Nim : ");
        String nim=input11.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

       
        if (n < 10) {
            n += 10;
        }
        System.out.println("==============");
        System.out.println("n : " + n);
        System.out.print("OUTPUT: ");
        
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
