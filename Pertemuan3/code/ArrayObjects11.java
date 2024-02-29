package Pertemuan3.code;
import java.util.Scanner;
public class ArrayObjects11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Panjang Array : ");
        int length = sc.nextInt();

        PersegiPanjang11[] ppArray = new PersegiPanjang11[length];


        for(int i=0; i<length;i++){
            ppArray[i] = new PersegiPanjang11();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukan Panjang: ");
            ppArray[i].panjang= sc.nextInt() ;
            System.out.print("Masukan Lebar :");
            ppArray[i].lebar = sc.nextInt();
            
        }

        for(int i=0;i<length;i++){
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }

        

    }
    
}
