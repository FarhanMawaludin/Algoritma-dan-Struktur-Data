package Pertemuan3.code;

public class limasSegiEmpat11 {
    public int panjangSisiAlas;
    public int tinggi;

    

    public double  hitungLuasLimas(){
        return((panjangSisiAlas*panjangSisiAlas) + 4 * (1/2 * panjangSisiAlas * tinggi));
    }

    public double hitungVolumeLimas(){
        return (1.0/3 * panjangSisiAlas * panjangSisiAlas * tinggi);
    }
}
