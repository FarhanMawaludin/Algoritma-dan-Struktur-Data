package Pertemuan3.code;

public class Balok11 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok11(int p, int l,int t){
        panjang = p;
        lebar=l;
        tinggi=t;
    }

    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
}
