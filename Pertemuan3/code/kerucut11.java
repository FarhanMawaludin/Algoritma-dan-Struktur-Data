package Pertemuan3.code;

public class kerucut11 {
    public int jari;
    public int sisiMiring;



    public double hitungLuasKerucut(){
        return  ((3.14 * jari * sisiMiring) + (3.14*jari*jari));
    }

    public double hitungVolumeKerucut(){
        return ((3.14 * jari * jari * sisiMiring)/3);
    }
}
