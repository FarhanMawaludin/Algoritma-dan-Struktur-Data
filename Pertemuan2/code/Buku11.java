
public class Buku11 {
    
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;
    int terjual;
    

   
    
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp" + harga);
    }

    
    void terjual(int jml) {
        if (stok > 0 && stok >=jml) {
            terjual=jml;
            stok -= jml;
            
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok habis, tidak dapat melakukan penjualan.");
        }
    }

    
    void restock(int jml) {
        stok += jml;
    }

    
    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(){
        int hargaTotal = harga * terjual;
        return hargaTotal;
    }
    
    int hitungDiskon(){
        int total = hitungHargaTotal();
        if(total > 150000){
            return (total * 12 / 100);
        } else if(total >= 75000 && total <= 150000){
            return (total * 5 / 100);
        } else {
            return 0;
        }
    }
    
    int hitungHargaBayar(){
        int total = hitungHargaTotal();
        int diskon = hitungDiskon();
        int hargaBayar = total - diskon;
        return hargaBayar;
    }
    Buku11(){

    }

    public Buku11(String jud, String pg, int hal, int stok, int har) {
        judul=jud;
        pengarang=pg;
        halaman=hal;
        this.stok=stok;
        harga=har;    
    }
    
}


