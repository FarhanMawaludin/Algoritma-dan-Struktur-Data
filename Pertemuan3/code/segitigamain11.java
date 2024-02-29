package Pertemuan3.code;

public class segitigamain11 {
    public static void main(String[] args) {
        segitiga11[] sgArray = new segitiga11[4];

        sgArray[0] = new segitiga11(10,4);
        sgArray[1] = new segitiga11(20,10);
        sgArray[2] = new segitiga11(15,6);
        sgArray[3] = new segitiga11(25,10);

        for  (int i=0;i<sgArray.length;i++) {
            System.out.println("Luas Segitiga ke-" +i + " adalah "+sgArray[i].hitungLuas() +" dan keliling segitiga adalah " + sgArray[i].hitungKeliling());
        }

    }
    
}
