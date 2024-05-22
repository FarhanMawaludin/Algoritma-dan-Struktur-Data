import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList table = new LinkedList();

        table.addTim(new Tim("Manchester City"));
        table.addTim(new Tim("Liverpool"));
        table.addTim(new Tim("Chelsea"));
        table.addTim(new Tim("Tottenham Hotspur"));
        table.addTim(new Tim("Arsenal"));
        table.addTim(new Tim("Manchester United"));
        table.addTim(new Tim("West Ham United"));
        table.addTim(new Tim("Leicester City"));
        table.addTim(new Tim("Wolverhampton Wanderers"));
        table.addTim(new Tim("Brighton & Hove Albion"));
        table.addTim(new Tim("Brentford"));
        table.addTim(new Tim("Crystal Palace"));
        table.addTim(new Tim("Everton"));
        table.addTim(new Tim("Southampton"));
        table.addTim(new Tim("Leeds United"));
        table.addTim(new Tim("Aston Villa"));
        table.addTim(new Tim("Newcastle United"));
        table.addTim(new Tim("Nottingham Forest"));
        table.addTim(new Tim("Fulham"));
        table.addTim(new Tim("Burnley"));

        int[] matchResults = {
        0, 1, 2, 1, // Manchester City 2 - 1 Liverpool
        1, 2, 1, 1, // Chelsea 1 - 1 Tottenham Hotspur
        3, 4, 3, 0, // Arsenal 3 - 0 Manchester United
        2, 5, 2, 2, // West Ham United 2 - 2 Leicester City
        6, 7, 1, 0, // Wolverhampton Wanderers 1 - 0 Brighton & Hove Albion
        8, 9, 2, 1, // Brentford 2 - 1 Crystal Palace
        10, 11, 1, 1, // Everton 1 - 1 Southampton
        12, 13, 2, 1, // Leeds United 2 - 1 Aston Villa
        14, 15, 3, 1, // Newcastle United 3 - 1 Nottingham Forest
        16, 0, 1, 2, // Fulham 1 - 2 Manchester City
        0, 1, 1, 1, // Manchester City 1 - 1 Liverpool
        2, 3, 2, 0, // Chelsea 2 - 0 Arsenal
        4, 5, 2, 3, // Manchester United 3 - 2 West Ham United
        6, 7, 0, 1, // Wolverhampton Wanderers 0 - 1 Brighton & Hove Albion
        8, 9, 1, 1, // Brentford 1 - 1 Crystal Palace
        10, 11, 2, 2, // Everton 2 - 2 Southampton
        12, 13, 0, 2, // Leeds United 0 - 2 Aston Villa
        14, 15, 2, 2, // Newcastle United 2 - 2 Nottingham Forest
        18, 19, 5, 1
        };

        table.updateKlasemen(matchResults);

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("====================================================");
            System.out.println("Klasemen Liga Premier Inggris");
            System.out.println("====================================================");
            System.out.println("1. Tampilkan Klasemen");
            System.out.println("2. Tampilkan Hasil Pertandingan");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    table.tampilkanKlasemen();
                    break;
                case 2:
                    table.tampilkanHasil(matchResults);
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}