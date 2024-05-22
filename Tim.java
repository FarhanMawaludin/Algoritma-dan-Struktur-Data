public class Tim {
    String nama;
    int poin;
    int menang;
    int seri;
    int kalah;
    int selisihGol;

    public Tim(String nama) {
        this.nama = nama;
        this.poin = 0;
        this.menang = 0;
        this.seri = 0;
        this.kalah = 0;
        this.selisihGol = 0;
    }

    public void updatePoin(int hasil) {
        switch (hasil) {
            case 1: // Menang
                this.poin += 3;
                this.menang++;
                break;
            case 0: // Seri
                this.poin += 1;
                this.seri++;
                break;
            case -1: // Kalah
                break;
        }
    }

    public void updateSelisihGol(int golMasuk, int golKebobolan) {
        this.selisihGol += golMasuk - golKebobolan;
    }

}