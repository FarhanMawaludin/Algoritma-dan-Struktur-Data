package Pertemuan16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListMahasiswa {
    private ArrayList<Mahasiswa> mahasiswas;

    public ListMahasiswa() {
        this.mahasiswas = new ArrayList<>();
    }

    public void tambah(Mahasiswa... mhs) {
        mahasiswas.addAll(Arrays.asList(mhs));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    public int binarySearch(String nim) {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, "", ""), Comparator.comparing(m -> m.nim));
    }

    public void updateMahasiswa(String nim, Mahasiswa newMhs) {
        int index = binarySearch(nim);
        if (index >= 0) {
            update(index, newMhs);
        } else {
            System.out.println("Mahasiswa with NIM " + nim + " not found.");
        }
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, Comparator.comparing(Mahasiswa::getNim).reversed());
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();

        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);

        // menampilkan list mahasiswa
        System.out.println("Daftar Mahasiswa:");
        lm.tampil();

        // sort ascending
        System.out.println("\nDaftar Mahasiswa setelah sorting ascending:");
        lm.sortAscending();
        lm.tampil();

        // sort descending
        System.out.println("\nDaftar Mahasiswa setelah sorting descending:");
        lm.sortDescending();
        lm.tampil();

        // update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("\nDaftar Mahasiswa setelah update:");
        lm.tampil();
    }
}
