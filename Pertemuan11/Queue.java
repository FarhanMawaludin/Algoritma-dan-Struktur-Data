package Pertemuan11;

class Queue {
    MahasiswaQueue front, rear;

    Queue() {
        this.front = this.rear = null;
    }

    
    void enqueue(int NIM, String nama) {
        MahasiswaQueue newNode = new MahasiswaQueue(NIM, nama);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    MahasiswaQueue dequeue() {
        if (this.front == null) return null;
        MahasiswaQueue temp = this.front;
        this.front = this.front.next;
        if (this.front == null) this.rear = null;
        return temp;
    }

    void printQueue() {
        MahasiswaQueue current = front;
        while (current != null) {
            System.out.println("NIM: " + current.NIM + ", Nama: " + current.nama);
            current = current.next;
        }
    }
}