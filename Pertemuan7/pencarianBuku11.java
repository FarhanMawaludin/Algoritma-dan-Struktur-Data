

public class pencarianBuku11 {
    Buku11 [] listBK = new Buku11[5];
    int idx;

    void tambahBuku( Buku11 m){
        if(idx < listBK.length){
            listBK[idx]=m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    public void tampilDataBuku(){
        for (Buku11 m : listBK){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari){
        for (int j = 0 ; j <listBK.length; j++){
            if (listBK[j].kodeBuku == cari){
                return j;
            }    
        }
        return -1;
    }
    public void tampilPosisi(int x, int pos){
        if ( pos != -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData (int x, int pos){
        if (pos != -1){
            System.out.println("Kode Buku : " + x);
            System.out.println(" Judul : " + listBK[pos].judul);
            System.out.println("Tahun Terbit : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBK[pos].pengarang);
            System.out.println("Stok : " + listBK[pos].stok);
        }else {
            System.out.println("Data " + x + " tidak ditemukan!!");
        }
    }

  
    public Buku11 FindBuku(int cari) {
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku == cari) {
                return listBK[j];
            }
        }
        return null;
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = left + (right - left) / 2;
            if ( cari == listBK[mid].kodeBuku){
                return mid;
            }else if (listBK[mid].kodeBuku < cari){
                return FindBinarySearch(cari, left, mid -1);
            }else {
                return FindBinarySearch (cari, mid +1, right);
            }
        }
        return -1;
    }
}
