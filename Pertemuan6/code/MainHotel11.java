public class MainHotel11 {
    public static void main(String[] args) {
        HotellService11 hotel = new HotellService11();

        Hotel11 h1 = new Hotel11("Hotel A", "Jakarta", 500000, (byte) 4);
        Hotel11 h2 = new Hotel11("Hotel B", "Bandung", 300000, (byte) 3);
        Hotel11 h3 = new Hotel11("Hotel C", "Surabaya", 700000, (byte) 5);
        Hotel11 h4 = new Hotel11("Hotel D", "Yogyakarta", 400000, (byte)2);


        hotel.tambah(h1);
        hotel.tambah(h2);
        hotel.tambah(h3);
        hotel.tambah(h4);

        System.out.println("Data Hotel Sebelum Sorting :");
        hotel.tampilAll();

        System.out.println("Data Harga Hotel Setelah Disorting");
        hotel.bubbleSort();
        hotel.tampilAll();

        System.out.println("Data Bintang Hotel Setelah Disorting : ");
        hotel.selectionSort();
        hotel.tampilAll();
    }
}
