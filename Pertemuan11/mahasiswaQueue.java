package Pertemuan11;

class MahasiswaQueue {
    int NIM;
    String nama;
    MahasiswaQueue next;

    MahasiswaQueue(int NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
        this.next = null;
    }
}