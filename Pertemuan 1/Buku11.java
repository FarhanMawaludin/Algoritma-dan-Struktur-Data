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
            jml = terjual;
            stok -= jml;
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok habis, tidak dapat melakukan penjualan.");
        }
    }

    
    void restock(int jml) {
        stok += jml;
    }

    
    int gantiHarga(int hrg) {
        harga = hrg;
        return  harga;
    }

    int hitungHargaTotal(){
        return harga*terjual;
    }

    int hitungDiskon(){
        int hargaTotal = hitungHargaTotal();
        if(hargaTotal > 150000){
            return hargaTotal * 12/100;
        }else if(hargaTotal >= 75000 && hargaTotal<=150000){
            return hargaTotal* 5/100;
        }else{
            return 0;
        }
    }

    int hitungHargaBayar(){
        int hargaTotal = hitungHargaTotal();
        int diskon = hitungDiskon();
        return hargaTotal - diskon;
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


