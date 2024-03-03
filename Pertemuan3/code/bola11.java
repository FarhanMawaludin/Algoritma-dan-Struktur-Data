package Pertemuan3.code;

public class bola11 {
    public int jari;

    bola11(){
        
    }


    public double hitungLuasBola(){
        double luasPermukaan = 4 * Math.PI * Math.pow(jari, 2);
        return luasPermukaan;
    }

    public double hitungVolumeBola(){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jari, 3);
        return volume;

    }
 }
