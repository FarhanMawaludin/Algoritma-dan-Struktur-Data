package Pertemuan11;

public class Mahasiswa {
    int NIM;
    String Nama;
    Mahasiswa next;

    public Mahasiswa(int NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.next = null;
    }
}
