package Pertemuan3.code;

public class Main2D11 {
    public static void main(String[] args) {
        Mahasiswa2D11[][] mhs = new Mahasiswa2D11[2][2];

        mhs[0][0] = new Mahasiswa2D11();
        mhs[0][0].nama = "wawan";
        mhs[0][0].nim = "2341";
        System.out.println("Nama mahasiswa adalah " + mhs[0][0].nama + " dengan NIM " + mhs[0][0].nim);

        mhs[0][1] = new Mahasiswa2D11();
        mhs[0][1].nama = "wiwi";
        mhs[0][1].nim = "2350";
        System.out.println("Nama mahasiswa adalah " + mhs[0][1].nama + " dengan NIM " + mhs[0][1].nim);
        }
    
}
