public class Mahasiswaa11 {
    String nama;
    int thnMasuk;
    int umur;
    double  ipk;

    Mahasiswaa11(String n, int t, int u, double i){
        nama = n;
        thnMasuk=t;
        umur=u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun Masuk = "+thnMasuk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
}