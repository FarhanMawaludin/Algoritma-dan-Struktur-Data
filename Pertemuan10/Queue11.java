package Pertemuan10;

import javax.sound.midi.Soundbank;

public class Queue11 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    Queue11(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size ==0){
            return  true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if  (size == max){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: " + data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i !=rear) {
                System.out.println(data[i] + " ");
                i = (i+1) % max ;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear(){
        if(IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if ( rear==max-1) {
                    rear=0;
                } else {
                    rear++;
                }
            }
            data[rear]=dt;
            size++;
        }
    }

    public int Dequeue(){
        int dt =0;
        if(IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if( IsEmpty() ) {
                front = rear = -1;
            } else {
                if(front == max -1){
                    front =0;
                }else{
                    front++;
                }
            }
        }
        return dt;

    }

    public static void menu(){
        System.out.println("Masukan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }
}
