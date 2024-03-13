package Pertemuan5;

public class sum11 {
    int elemen;
    double keuntungan[],total;

    sum11(int elemen){ 
        this.elemen = elemen;
        this.keuntungan = new double [elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i=0;i<elemen;i++){
            total = total + keuntungan[i];
        }return total;
    }

    double totalDC(double[] keuntungan, int l, int r){
    if (l==r){
        return keuntungan[l];
    }else if (l < r){
        int mid = (l+r)/2;
        double lsum = totalDC(keuntungan, l, mid );
        double rsum = totalDC(keuntungan, mid+1, r);
        return lsum+rsum;
    }return 0;
        }

}
