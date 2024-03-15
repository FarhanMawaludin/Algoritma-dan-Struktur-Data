// Class pangkat11
package Pertemuan5;

public class pangkat11 {
    public int nilai;
    public int pangkat;

    public pangkat11(int a, int n) {
        this.nilai = a;
        this.pangkat = n;
    }

    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }

    public int pangkatDC() {
        if (pangkat == 0) {
            return 1;
        } else {
            if (pangkat % 2 == 1) {
                return (pangkatDC(nilai, pangkat / 2) * pangkatDC(nilai, pangkat / 2) * nilai);
            } else {
                return (pangkatDC(nilai, pangkat / 2) * pangkatDC(nilai, pangkat / 2));
            }
        }
    }
    private int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
}
}
