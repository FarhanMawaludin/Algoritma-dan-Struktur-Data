package Pertemuan8;

public class Gudang11 {
    
    Barang11[] tumpukan;
    int size;
    int top;

    public Gudang11(int kapasitas){
        size = kapasitas;
        tumpukan  = new Barang11[size];
        top = -1;
    }

    public boolean cekKosong(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean cekPenuh(){
        if ( top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void tambahBarang(Barang11 brg){
        if (!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + "  berhasil ditambahkan ke Gudang");
        }else {
            System.out.println("Gagal!! Tumpukan barang di Gudang sudah Penuh");
        }
    }

    public Barang11 ambilBarang(){
        if(!cekKosong()){
            Barang11 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang11 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang11 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas: " + barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("Tumpukan Barang kosong");
            return null;
        }
    }

    public void tampilBarang(){
        if (!cekKosong()){
            System.out.println("Rincian tumpukan  barang di Gudang:");
            for(int i = top; i >= 0; i--){
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode){
        StackKonversi11 stack = new StackKonversi11();
        while (kode > 0) {
            int sisa = kode % 2 ;
            stack.push(sisa);
            kode = kode/ 2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner = biner + stack.pop();
        }
        return biner;

    }

    public Barang11 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang11 barangTerbawah = tumpukan[0];
            System.out.println("Barang teratas: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void cariBarang(String key) {
        boolean ditemukan = false;

        for (int j=0; j<=top; j++) {
            try {
                int kodeKey = Integer.parseInt(key);
                if (tumpukan[j].nama.equalsIgnoreCase(key) || tumpukan[j].kode == kodeKey) {
                    System.out.println("Barang ditemukan!");
                    ditemukan = true;
                    System.out.println("Kode Barang: "+ tumpukan[j].kode);
                    System.out.println("nama Barang: "+ tumpukan[j].nama);
                    System.out.println("Kategori Barang: "+ tumpukan[j].kategori);
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                break;
            }
        }

        for (int j=0; j<=top; j++) {
            if (tumpukan[j].nama.equalsIgnoreCase(key)){
                System.out.println("Barang ditemukan!");
                System.out.println("Kode Barang: "+ tumpukan[j].kode);
                System.out.println("nama Barang: "+ tumpukan[j].nama);
                System.out.println("Kategori Barang: "+ tumpukan[j].kategori);
                return;
            } else {
                System.out.println("");
            }
        }

        if (!ditemukan) {
            System.out.println("Barang tidak ditemukan!");
        }  
    }    
}
