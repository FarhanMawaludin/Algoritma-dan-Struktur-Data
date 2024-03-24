public class HotellService11 {
    Hotel11[] rooms = new Hotel11[5];
    int idx;

    void tambah(Hotel11 h){
        if (idx < rooms.length){
            rooms[idx] = h;
            idx++;
        }else{
            System.out.println("Hotel penuh");
        }
    }

    public void tampilAll() {
        for (Hotel11 h : rooms) {
            if (h != null) {
                h.tampilAll();
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j] != null && rooms[j + 1] != null && rooms[j].harga > rooms[j + 1].harga) {
                    Hotel11 tmp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j] != null && rooms[minIndex] != null && rooms[j].bintang > rooms[minIndex].bintang) {
                    minIndex = j;
                }
            }
            if (rooms[minIndex] != null && rooms[i] != null) {
                Hotel11 tmp = rooms[minIndex];
                rooms[minIndex] = rooms[i];
                rooms[i] = tmp;
            }
        }
    }
}
