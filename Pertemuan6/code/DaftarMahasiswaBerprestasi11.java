

public class DaftarMahasiswaBerprestasi11 {
    Mahasiswaa11 [] listMhs = new Mahasiswaa11[5];
    int idx;

    void tambah(Mahasiswaa11 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for ( Mahasiswaa11 m : listMhs){
            m.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswaa11 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSortAscen(){
            for (int i = 0; i < listMhs.length; i++) {
                int idxMin = i;
                for (int j = i+1; j < listMhs.length; j++) {
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }
                
                Mahasiswaa11 tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
            }
    }

    void insertionSort(){
        for (int i = 1 ; i < listMhs.length ; i++){
            Mahasiswaa11 temp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk < temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}