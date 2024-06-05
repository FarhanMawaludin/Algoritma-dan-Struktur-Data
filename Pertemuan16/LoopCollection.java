package Pertemuan16;

import java.util.Iterator;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        // Membuat Stack dengan tipe String
        Stack<String> fruits = new Stack<>();
        
        // Menambahkan elemen-elemen ke Stack
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        
        // Menggunakan for-each loop untuk mencetak setiap elemen
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        // Menggunakan while loop untuk mencetak dan menghapus setiap elemen
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        System.out.println("\n"); // Tambahkan baris kosong untuk pemisahan output

        // Menambahkan elemen-elemen baru ke Stack
        fruits.push("Melon");
        fruits.push("Durian");

    
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n");

        // Menggunakan forEach method dan lambda expression untuk mencetak setiap elemen
        fruits.stream().forEach(e -> System.out.printf("%s ", e));

        System.out.println("\n");

        // Menggunakan for loop dengan indeks untuk mencetak setiap elemen
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        // Ganti elemen pada indeks 1 menjadi "Strawberry"
        if (fruits.size() > 1) {
            fruits.set(1, "Strawberry");
        }

        // Menambahkan elemen baru ke Stack
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Menampilkan elemen-elemen yang baru ditambahkan
        System.out.println("\nAfter adding more fruits:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
    }
}
