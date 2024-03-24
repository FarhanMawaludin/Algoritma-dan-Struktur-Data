public class mainMahasiswa11 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi11 list = new DaftarMahasiswaBerprestasi11();
        
        Mahasiswaa11 m1 = new Mahasiswaa11("Nusa",2017,25,3);
        Mahasiswaa11 m2 = new Mahasiswaa11("Rara", 2012, 19, 4);
        Mahasiswaa11 m3 = new Mahasiswaa11("Dompu", 2018, 19, 3.5);
        Mahasiswaa11 m4 = new Mahasiswaa11("Abdul", 2017, 23, 2);
        Mahasiswaa11 m5 = new Mahasiswaa11("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();

    }
}
