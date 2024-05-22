package Kuis2;
class Tim {
    String name;
    int banyakMain;
    int totalMenang;
    int totalKalah;
    int poin;

    public Tim(String name) {
        this.name = name;
        this.banyakMain = 0;
        this.totalMenang = 0;
        this.totalKalah = 0;
        this.poin = 0;
    }

    public String toString() {
        return String.format("%-35s %2d %6d %6d %6d", name, banyakMain, totalMenang, totalKalah, poin);
    }

    public void catatPertandingan(boolean menang) {
        this.banyakMain++;
        if (menang) {
            this.totalMenang++;
            this.poin += 2;
        } else {
            this.totalKalah++;
            this.poin += 1;
        }
    }
}