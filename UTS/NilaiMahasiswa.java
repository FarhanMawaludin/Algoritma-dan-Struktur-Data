package UTS;
public class NilaiMahasiswa {
    Mahasiswa[]listnilai;
    int idx;

    public NilaiMahasiswa() {
        listnilai = new Mahasiswa[17];
        idx = 0; 
    }

    void tampil() {
        for (int i = 0; i < listnilai.length; i++) 
            listnilai[i].tampildata();
    }

    void tambah(Mahasiswa m) {
        if (idx < listnilai.length) {
            listnilai[idx] = m;
            idx++;
        } else
            System.out.println("Array penuhu");
    }

    public int FindBinarySearchasce(int cari, int left, int right){
        if (right >= left){
            int mid = left + (right - left) / 2;
            
            if (cari == listnilai[mid].nilai) {
                return mid;
            }
            
            if (cari < listnilai[mid].nilai) {
                return FindBinarySearchasce(cari, left, mid - 1);
            }
            
            return FindBinarySearchasce(cari, mid + 1, right);
        }
        
        return -1;
    }

    public int FindBinarySearchdesce(int cari, int left, int right){
        if (right >= left){
            int mid = left + (right - left) / 2;
            
            if (cari == listnilai[mid].nilai) {
                return mid;
            }
            
            if (cari > listnilai[mid].nilai) {
                return FindBinarySearchdesce(cari, left, mid - 1);
            }
            
            return FindBinarySearchdesce(cari, mid + 1, right);
        }
        
        return -1;
    }

    public void tampilPosisi(int x, int pos) { 
        if (pos != -1) {
            System.out.println("Data: "+ x +" ditemukan pada indeks "+ pos);
        } else {
            System.out.println("Data: "+ x + " tidak ditemukan!");
        }
    }


    void selectionSortAscen(){
        for (int i = 0; i < listnilai.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listnilai.length; j++) {
                if (listnilai[j].nilai < listnilai[idxMin].nilai) {
                    idxMin = j;
                }
            }
            
            Mahasiswa temp = listnilai[idxMin];
            listnilai[idxMin] = listnilai[i];
            listnilai[i] = temp;
        }
    }

    void selectionSortDescen(){
    for (int i = 0; i < listnilai.length - 1; i++) {
        int idxMax = i;
        for (int j = i+1; j < listnilai.length; j++) {
            if (listnilai[j].nilai > listnilai[idxMax].nilai) {
                idxMax = j;
            }
        }
        
        Mahasiswa tmp = listnilai[idxMax];
        listnilai[idxMax] = listnilai[i];
        listnilai[i] = tmp;
    }
}
    
}
