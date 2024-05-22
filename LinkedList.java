public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addTim(Tim tim) {
        Node newNode = new Node(tim);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void updateKlasemen(int[] hasil) {
        for (int i = 0; i < hasil.length; i += 4) {
            int indexKandang = hasil[i];
            int indexTandang = hasil[i + 1];
            int golKandang = hasil[i + 2];
            int golTandang = hasil[i + 3];

            Tim timKandang = cariTim(indexKandang);
            Tim timTandang = cariTim(indexTandang);

            timKandang.updateSelisihGol(golKandang, golTandang);
            timTandang.updateSelisihGol(golTandang, golKandang);

            if (golKandang > golTandang) {
                timKandang.updatePoin(3); // Menang
                timTandang.updatePoin(0); // Kalah
            } else if (golKandang == golTandang) {
                timKandang.updatePoin(1); // Seri
                timTandang.updatePoin(1); // Seri
            } else {
                timKandang.updatePoin(0); // Kalah
                timTandang.updatePoin(3); // Menang
            }
        }

        urutkanKlasemen();
    }

    public Tim cariTim(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IllegalArgumentException("Indeks diluar batas");
            }
            current = current.next;
        }
        return current.tim;
    }

    public void tampilkanHasil(int[] matchResults) {
        System.out.printf("%-22s | %-22s | %s%n", "Tim Kandang        ", "Tim Tandang        ", "Skor");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < matchResults.length; i += 4) {
          int kandangIndex = matchResults[i];
          int tandangIndex = matchResults[i + 1];
          int kandangGol = matchResults[i + 2];
          int tandangGol = matchResults[i + 3];
      
          Tim timKandang = cariTim(kandangIndex);
          Tim timTandang = cariTim(tandangIndex);
      
          // Truncate team names if longer than 22 characters (adjustable)
          String formattedKandang = timKandang.nama.substring(0, Math.min(timKandang.nama.length(), 22));
          String formattedTandang = timTandang.nama.substring(0, Math.min(timTandang.nama.length(), 22));
      
          // Use String.format with non-breaking spaces
          System.out.printf("%-22s | %-22s | %d - %d%n", formattedKandang, formattedTandang, kandangGol, tandangGol);
        }
      }

    public void urutkanKlasemen() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node prev = null;
            Node next = head.next;

            while (next != null) {
                if (current.tim.poin < next.tim.poin) {
                    if (prev != null) {
                        prev.next = next;
                    } else {
                        head = next;
                    }
                    current.next = next.next;
                    next.next = current;

                    prev = next;
                    next = current.next;
                    swapped = true;
                } else {
                    prev = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (swapped);
    }

    public void tampilkanKlasemen() {
        System.out.printf("%-5s | %-25s | %-5s | %-6s | %-5s | %-5s | %-3s%n", "Rank", "Tim", "Poin", "Menang", "Seri", "Kalah", "SG");
        System.out.println("--------------------------------------------------------------------------");
        Node current = head;
        int ranking = 1;
        while (current != null) {
            System.out.printf("%-5d | %-25s | %-5d | %-6d | %-5d | %-5d | %-3d%n", ranking, current.tim.nama, current.tim.poin, current.tim.menang, current.tim.seri, current.tim.kalah, current.tim.selisihGol);
            current = current.next;
            ranking++;
        }
    }


}