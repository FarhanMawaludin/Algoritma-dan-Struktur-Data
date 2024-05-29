package Pertemuan12;

class doublefilm11 {
 
    private film11 head, tail;

    public void tambahAwal(int id, String judul, double rating) {
        film11 newfilm11 = new film11(id, judul, rating);
        if (head == null) {
            head = tail = newfilm11;
        } else {
            newfilm11.next = head;
            head.prev = newfilm11;
            head = newfilm11;
        }
    }

    public void tambahAkhir(int id, String judul, double rating) {
        film11 newfilm11 = new film11(id, judul, rating);
        if (tail == null) {
            head = tail = newfilm11;
        } else {
            tail.next = newfilm11;
            newfilm11.prev = tail;
            tail = newfilm11;
        }
    }

    public void tambahPadaIndex(int index, int id, String judul, double rating) {
        if (index <= 0) {
            tambahAwal(id, judul, rating);
            return;
        }
        
        film11 newfilm11 = new film11(id, judul, rating);
        film11 current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                break;
            }
            current = current.next;
        }

        if (current == null || current.next == null) {
            tambahAkhir(id, judul, rating);
        } else {
            newfilm11.next = current.next;
            newfilm11.prev = current;
            current.next.prev = newfilm11;
            current.next = newfilm11;
        }
    }

    public void hapusPertama() {
        if (head != null) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void hapusTerakhir() {
        if (tail != null) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void hapusPadaIndex(int index) {
        if (index <= 0) {
            hapusPertama();
            return;
        }

        film11 current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        if (current == null || current.prev == null) {
            hapusTerakhir();
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    public void cetak() {
        film11 current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Judul: " + current.judul + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    public film11 cariID(int id) {
        film11 current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void urutRatingDesc() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            film11 current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    double tempRating = current.rating;
                    current.rating = current.next.rating;
                    current.next.rating = tempRating;

                    int tempId = current.id;
                    current.id = current.next.id;
                    current.next.id = tempId;

                    String tempJudul = current.judul;
                    current.judul = current.next.judul;
                    current.next.judul = tempJudul;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}