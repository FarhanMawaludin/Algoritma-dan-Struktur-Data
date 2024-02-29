package Pertemuan3.code;

public class balokMain11 {
    public static void main(String[] args) {
        Balok11[] blArray = new Balok11[3];

        blArray[0] = new Balok11(100, 30, 12);
        blArray[1] = new Balok11(120, 40, 15);
        blArray[2] = new Balok11(210, 50, 25);

        for (int i=0; i<3;i++){
            System.out.println("Volume Balok Ke " + i +" : " + blArray[i].hitungVolume());
        }

    }
}
