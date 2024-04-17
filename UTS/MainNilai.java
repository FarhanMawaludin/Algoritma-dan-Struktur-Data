package UTS;

public class MainNilai {
    public static void main(String[] args) {    
        NilaiMahasiswa maha = new NilaiMahasiswa(); 
        int jumMaha=17;

        Mahasiswa m1 = new Mahasiswa(43);
        Mahasiswa m2 = new Mahasiswa(47);
        Mahasiswa m3 = new Mahasiswa(44);
        Mahasiswa m4 = new Mahasiswa(5);
        Mahasiswa m5 = new Mahasiswa(38);
        Mahasiswa m6 = new Mahasiswa(46);
        Mahasiswa m7 = new Mahasiswa(45);
        Mahasiswa m8 = new Mahasiswa(22);
        Mahasiswa m9 = new Mahasiswa(4);
        Mahasiswa m10 = new Mahasiswa(30);
        Mahasiswa m11 = new Mahasiswa(2);
        Mahasiswa m12 = new Mahasiswa(49);
        Mahasiswa m13 = new Mahasiswa(31);
        Mahasiswa m14 = new Mahasiswa(2);
        Mahasiswa m15 = new Mahasiswa(38);
        Mahasiswa m16 = new Mahasiswa(10);
        Mahasiswa m17 = new Mahasiswa(13);

        

        maha.tambah(m1);
        maha.tambah(m2);
        maha.tambah(m3);
        maha.tambah(m4);
        maha.tambah(m5);
        maha.tambah(m6);
        maha.tambah(m7);
        maha.tambah(m8);
        maha.tambah(m9);
        maha.tambah(m10);
        maha.tambah(m11);
        maha.tambah(m12);
        maha.tambah(m13);
        maha.tambah(m14);
        maha.tambah(m15);
        maha.tambah(m16);
        maha.tambah(m17);

        
        

        //Sebelum Sorting
        maha.tampil();
        int posisisebelum =maha.FindBinarySearchasce(4, 0, jumMaha -1);
        maha.tampilPosisi(4, posisisebelum );

        //Sorting ascending
        maha.selectionSortAscen();
        maha.tampil();
        int posisiAscending = maha.FindBinarySearchasce(4, 0, jumMaha -1);
        maha.tampilPosisi(4, posisiAscending);

        //Sorting Descendinf
        maha.selectionSortDescen();
        maha.tampil();
        int  posisiDescending= maha.FindBinarySearchdesce(4, 0, jumMaha-1);
        maha.tampilPosisi(4, posisiDescending);

        maha.selectionSortAscen();
        maha.tampil();
        int posisitidak = maha.FindBinarySearchasce(99, 0, jumMaha-1);
        maha.tampilPosisi(99, posisitidak);
       
        
    }
    
}
