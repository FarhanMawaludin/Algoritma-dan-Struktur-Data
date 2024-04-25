# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>

## <p align ="center"> PERTEMUAN VIII <br> STACK </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Farhan Mawaludin </p>
<p align = "center"> NIM   : 2341720258 </p>
<p align = "center"> Prodi : TEKNIK INFORMATIKA</p>
<p align = "center"> Kelas : 1B </p>
<br><br>

# 10.2 Praktikum 1

<b> Kode class Queue11 </b><br>

```java
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
```

<br><b>Kode main </b><br>

```java
package Pertemuan10;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kapasitas queue: ");
        int n = sc.nextInt();

        Queue11 Q = new Queue11(n);

        int pilih;
        do {
            Queue11.menu();
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
```

<br><b>Output</b><br>

![alt text](image.png)

# 10.2.3 Pertanyaan

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0? <br>
   Jawab : nilai front dan rear bernilai -1 karena untuk memberitahu bahwa antriannya masih kosong dan atribut sizenya itu 0 karena belom ada elemen yang dimasukan.<br>
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! <br>

```java
if ( rear==max-1) {
    rear=0;
}
```

<br> 
Jawab : kode tersebut digunakan dan bermaksd jika rear sudah mencapai max-1 artinya arraynya sudah terisi penuh dan rear diatur kembali ke 0 untuk memulai dari awal.<br>

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>

```java
if(front == max -1){
    front =0;
}
```

 <br>
 Jawab : digunakan untuk mengatur ulang front ketika elemen pertama diambil, dan jika front sama dengan max-1 berarti sudah sampe di ahir array maka front diatur ulang ke 0<br>

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front? <br>
   Jawab : karena ingin mencetak secara berurutan dari lemen pertama<br>

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!<br>

```java
i = (i+1) % max ;
```

 <br>
 Jawab : digunakan untuk mengatur ulang nilai i dengan mod agar indeks i kembali ke 0 setelah mencapai max-1<br>

6. Tunjukkan potongan kode program yang merupakan queue overflow! <br>
   Jawab :ketika mencoba menambahkan elemen kedalam antrian saat antrian sudah penuh ketika pada kondisi IsFull() bernilai true<br>
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!<br>
   Jawab :

```java
public void Enqueue(int dt){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
            System.exit(0);
```

```java
public int Dequeue(){
        int dt =0;
        if(IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
```
