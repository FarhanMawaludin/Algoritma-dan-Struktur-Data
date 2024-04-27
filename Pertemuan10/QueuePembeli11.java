package Pertemuan10;

public class QueuePembeli11{
    pembeli11[] antrian;
    int front;
    int rear;  
    int size; 
    int max;

    QueuePembeli11(int n) {
        max = n;
        antrian = new pembeli11[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    void Enqueue(pembeli11 antri) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public pembeli11 Dequeue() {
        pembeli11 antri = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            antri = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return antri;
    }

    void Peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nama + " "
                    + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void PeekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang : " + antrian[rear].nama + " "
                    + antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void DaftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " "
                        + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " "
                    + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void PeekPosition(String nama) {
        int pos = -1;
        int i = front;
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                pos = i;
            }
            i = (i + 1) % max;
        }
        if (pos > 0) {
            System.out.println("Pelanggan yang anda cari berada pada posisi ke " + (pos + 1));
        } else {
            System.out.println("Pelanggan yang anda cari tidak ada");
        }
    }

    public void menu(){
        System.out.println("Pilihan menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4.Cek semua  antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari posisi pembeli");
        System.out.println("7. Keluar");
        System.out.println("--------------------------");

    }

}
