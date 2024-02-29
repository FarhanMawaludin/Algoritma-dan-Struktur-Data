
public class BukuMain11 {
    public static void main(String[] args) {
        
        Buku11 bk1 = new Buku11();

        
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok =13;
        bk1.harga = 71000;

        
        bk1.tampilInformasi();        
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku11 bk2 = new Buku11("Self Reward", "Maaheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku11 NamaMahasiswa = new Buku11("manusia biasa", "Maman Supratman", 200, 50, 50000);
        NamaMahasiswa.tampilInformasi();
        NamaMahasiswa.terjual(25);
        System.out.println("Harga Total: " + NamaMahasiswa.hitungHargaTotal());
        System.out.println("Diskon: " + NamaMahasiswa.hitungDiskon());
        System.out.println("Harga Bayar: " + NamaMahasiswa.hitungHargaBayar());
        
    }
}
