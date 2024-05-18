package Pertemuan11;

public class MahasiswaLinkedList {
    Mahasiswa head;

    public MahasiswaLinkedList() {
        this.head = null;
    }

    public void addFirst(int NIM, String Nama) {
        Mahasiswa baru = new Mahasiswa(NIM, Nama);
        baru.next = head;
        head = baru;
    }

    public void addLast(int NIM, String Nama) {
        Mahasiswa baru = new Mahasiswa(NIM, Nama);
        if (head == null) {
            head = baru;
            return;
        }
        Mahasiswa temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = baru;
    }

    public void insertAfter(int kunci, int NIM, String Nama) {
        Mahasiswa baru = new Mahasiswa(NIM, Nama);
        Mahasiswa temp = head;
        while (temp != null && temp.NIM != kunci) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data dengan NIM " + kunci + " tidak ditemukan.");
            return;
        }
        baru.next = temp.next;
        temp.next = baru;
    }

    public void insertAt(int posisi, int NIM, String Nama) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif!");
            return;
        }
        if (posisi == 0) {
            addFirst(NIM, Nama);
            return;
        }
        Mahasiswa baru = new Mahasiswa(NIM, Nama);
        Mahasiswa temp = head;
        for (int i = 0; i < posisi - 1; i++) {
            if (temp == null) {
                System.out.println("Posisi melebihi panjang linked list!");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Posisi melebihi panjang linked list!");
            return;
        }
        baru.next = temp.next;
        temp.next = baru;
    }

    public void cetak() {
        Mahasiswa temp = head;
        System.out.println("Isi Linked List:");
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
            temp = temp.next;
        }
        System.out.println();
    }
}
