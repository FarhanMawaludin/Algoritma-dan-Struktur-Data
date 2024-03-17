package Pertemuan5;

public class mainlatihan11 {
    public static void main(String[] args) {
        latihan11[] mb = {
            new latihan11("BMW", "M2 Coupe", 2016, 6816, 728),
            new latihan11("Ford", "Fiesta ST", 2014, 3921, 575),
            new latihan11("Nissan", "370Z", 2009, 4360, 657),
            new latihan11("Subaru", "BRZ", 2014, 4058, 609),
            new latihan11("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new latihan11("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new latihan11("Toyota", "86/GT86", 2014, 4180, 609),
            new latihan11("Volkswagen", "Golf GTI", 2014, 4180, 631)
    };

    
    int top_acc = mb[0].top_acc(mb, 0, mb.length - 1);
    int min_acc = mb[0].min_acc(mb, 0, mb.length - 1);

    
    double rata_toppow = mb[0].rata_toppow(mb);

   
    System.out.println("Top Acceleration Tertinggi: " + top_acc);
    System.out.println("Top Acceleration Terendah: " + min_acc);
    System.out.println("Rata-rata Top Power: " + rata_toppow);
}
}

