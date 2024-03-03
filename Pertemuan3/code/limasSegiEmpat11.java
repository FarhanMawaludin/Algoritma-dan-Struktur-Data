package Pertemuan3.code;

public class limasSegiEmpat11 {
    public int panjangSisiAlas;
    public int tinggi;

    

    public double  hitungLuasLimas(){
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double luasSisiTegak = panjangSisiAlas * tinggi;
        double luasPermukaan = luasAlas + (4 * luasSisiTegak);
        return luasPermukaan;
    }

    public double hitungVolumeLimas(){
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double volume = (1.0 / 3.0) * luasAlas * tinggi;
        return volume;
    }
}
