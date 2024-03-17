package Pertemuan5;

public class latihan11 {
    public String merk;
    public String tipe;
    public int tahun;
    public int topacc;
    public int toppow;

    public latihan11(String merk, String tipe, int tahun,int topacc,int toppow){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun=tahun;
        this.topacc=topacc;
        this.toppow=toppow;
    }

    int top_acc(latihan11[]mb,int low,int high){
        if (low==high){
            return mb[low].topacc;
        }
        int mid =(low+high)/2;
        int max1 = top_acc(mb, low, mid);
        int max2 = top_acc(mb,mid+1 , high);

        if (max1 > max2) {
            return max1;
        } else {
            return max2;
        }
    }

    int min_acc(latihan11[] mb, int low, int high) {
        if (low == high) {
            return mb[low].topacc; 
        }
        
        int mid = (low + high) / 2;
        int min1 = min_acc(mb, low, mid);
        int min2 = min_acc(mb, mid + 1, high);
    
        if (min1 <= min2) {
            return min1;
        } else {
            return min2;
        }
    }
    
    
    
    

    double rata_toppow(latihan11[]mb){
        int totalTenaga = 0;
        int hasil = 0;

        for (int i = 0 ; i< mb.length ; i++ ){
            totalTenaga = totalTenaga+mb[i].toppow;
            hasil++;
        }

        if  (hasil == 0) {
            return 0.0;
        }
        return (double)totalTenaga/hasil;
    }
}
