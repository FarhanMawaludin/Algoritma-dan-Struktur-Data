package coba;

import java.util.Scanner;

public class graphMain11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah gedung: ");
        int jumlahGedung = scanner.nextInt();

        graph11 gedung = new graph11(jumlahGedung);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Edge");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asalAdd = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanAdd = scanner.nextInt();
                    System.out.print("Masukkan bobot edge: ");
                    int bobotAdd = scanner.nextInt();
                    gedung.addEdge(asalAdd, tujuanAdd, bobotAdd);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    int asalRemove = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanRemove = scanner.nextInt();
                    gedung.removeEdge(asalRemove, tujuanRemove);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    int gedungDegree = scanner.nextInt();
                    gedung.degree(gedungDegree);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    int asalCheck = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanCheck = scanner.nextInt();
                    boolean tetangga = gedung.tetangga(asalCheck, tujuanCheck);
                    char gedungAsal = (char) ('A' + asalCheck);
                    char gedungTujuan = (char) ('A' + tujuanCheck);
                    if (tetangga) {
                        System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
                    } else {
                        System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();

        // graphMatriks11 gdg = new graphMatriks11(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // System.out.println();
        // for (int i = 0; i < 4; i++) {
        //     System.out.print("Gedung " + (char) ('A' + i) + ":");
        //     System.out.print("In-degree: " + gdg.inDegree(i));
        //     System.out.print("Out-degree: " + gdg.outDegree(i));
        //     System.out.print("Degree: " + gdg.degree(i));
        //     System.out.println();
        // }
    }
}
