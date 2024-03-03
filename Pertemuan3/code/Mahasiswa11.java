package Pertemuan3.code;

public class Mahasiswa11 {
    String nama;
    String nim;
    char  jenisKelamin;
    double ipk;

    

    public double rataIPK(Mahasiswa11[] mhs) {
        double totalIPK = 0;
        for (int i = 0; i < mhs.length; i++) {
            Mahasiswa11 mahasiswa = mhs[i];
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }

    public void ipkTertinggi(Mahasiswa11[] mhs) {
        Mahasiswa11 mahasiswaIPKTertinggi = mhs[0]; 
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ipk > mahasiswaIPKTertinggi.ipk) {
                mahasiswaIPKTertinggi = mhs[i];
            }
        }
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        System.out.println("Nama: " + mahasiswaIPKTertinggi.nama);
        System.out.println("NIM: " + mahasiswaIPKTertinggi.nim);
        System.out.println("Jenis Kelamin: " + mahasiswaIPKTertinggi.jenisKelamin);
        System.out.println("IPK: " + mahasiswaIPKTertinggi.ipk);
    }
}
    

