# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>

## <p align ="center"> PERTEMUAN II <br> OBJECT </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Farhan Mawaludin </p>
<p align = "center"> NIM   : 2341720258 </p>
<p align = "center"> Prodi : TEKNIK INFORMATIKA</p>
<p align = "center"> Kelas : 1B </p>
<br><br>

## 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan

### 3.2.1 Langkah-langkah Percobaan

#### Buat class PersegiPanjang

```java
public class PersegiPanjang {
    public int panjang;
    public int lebar;

   }
```

#### Pada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi 3 elemen

```java
public class ArrayObjects11 {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar =30;

        ppArray[1]= new PersegiPanjang();
        ppArray[1].panjang=80;
        ppArray[1].lebar=40;

        ppArray[2]= new PersegiPanjang();
        ppArray[2].panjang=100;
        ppArray[2].lebar=20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", Lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[1].panjang + ", Lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[2].panjang + ", Lebar: " + ppArray[2].lebar);

    }

}
```

#### Cetak ke layar semua atribut dari objek ppArray

```java
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", Lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[1].panjang + ", Lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[2].panjang + ", Lebar: " + ppArray[2].lebar);
```

### 3.2.2 Verifikasi Hasil Percobaan

![alt text](image.png)

### 3.2.3 Pertanyaan

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan! <br>
   Jawab : Tidak, walaupun class PersegiPanjang tidak memiliki method yang ada di dalamnya, kita masih dapat membuat array of objects dan menggunakan objek tersebut
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :<br>
   ppArray[1]= new PersegiPanjang();<br>
   Jawab : Tidakvada, karena pemanggilan konstruktor default karena tidak ada konstruktor yang didefinisikan di dalam class
3. Apa yang dimaksud dengan kode berikut ini:<br> PersegiPanjang[] ppArray = new PersegiPanjang[3]; <br>
   Jawab : Baris kode tersebut adalah instansiasi sebuah array dari objek-objek PersegiPanjang yang jumlah objeknya ada 3
4. Apa yang dimaksud dengan kode berikut ini: <br>
   ppArray[1]= new PersegiPanjang();<br>
   ppArray[1].panjang=80;<br>
   ppArray[1].lebar=40;<br>
   Jawab : baris kode tersebut membuat sebuah objek PersegiPanjang, kemudian untuk memberi nilai panjang dan lebar dari objek tersebut

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?<br>
   Jawab : dalam pengembangan perangkat lunak ini membantu dalam keterbacaan, pemeliharaan, dan pengembangan proyek yang lebih besar dan kompleks.

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping

### 3.3.1 Langkah-langkah Percobaan

```java

package Pertemuan3.code;
import java.util.Scanner;
public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for(int i=0; i<3;i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukan Panjang: ");
            ppArray[i].panjang= sc.nextInt() ;
            System.out.print("Masukan Lebar :");
            ppArray[i].lebar = sc.nextInt();

        }

        for(int i=0;i<3;i++){
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }

    }

}
```

### 3.3.2 Verifikasi Hasil Percobaan

![alt text](image-1.png)

### 3.3.3 Pertanyaan

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?<br>
   Jawab : iya dapat diimplementasikan
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!<br>
   Jawab :

```java
   package Pertemuan3.code;

public class Main2D11 {
    public static void main(String[] args) {
        Mahasiswa2D11[][] mhs = new Mahasiswa2D11[2][2];

        mhs[0][0] = new Mahasiswa2D11();
        mhs[0][0].nama = "wawan";
        mhs[0][0].nim = "2341";
        System.out.println("Nama mahasiswa adalah " + mhs[0][0].nama + " dengan NIM " + mhs[0][0].nim);

        }

}
```

<br>
HASIL<br>

![alt text](image-6.png)

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?<br>
   Jawab : Karena belum dibuat objek Persegi
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!<br>
   Jawab :

```java
package Pertemuan3.code;
import java.util.Scanner;
public class ArrayObjects11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Panjang Array : ");
        int length = sc.nextInt();

        PersegiPanjang11[] ppArray = new PersegiPanjang11[length];

        for(int i=0; i<length;i++){
            ppArray[i] = new PersegiPanjang11();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukan Panjang: ");
            ppArray[i].panjang= sc.nextInt() ;
            System.out.print("Masukan Lebar :");
            ppArray[i].lebar = sc.nextInt();

        }

        for(int i=0;i<length;i++){
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }



    }

}
```

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !<br>
   Jawab : boleh, tetapi objek yang pertama akan dihapus dan objek yang terahir yang akan tersimpan dalam array.

## 3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method

### 3.4.1 Langkah-langkah Percobaan

```java
package Pertemuan3.code;

public class balokMain11 {
    public static void main(String[] args) {
        Balok11[] blArray = new Balok11[3];

        blArray[0] = new Balok11(100, 30, 12);
        blArray[1] = new Balok11(120, 40, 15);
        blArray[2] = new Balok11(210, 50, 25);

        for (int i=0; i<3;i++){
            System.out.println("Volume Balok Ke " + i +" : " + blArray[i].hitungVolume());
        }

    }
}
```

### 3.4.2 Verifikasi Hasil program

![alt text](image-2.png)

### 3.4.3 Pertanyaan

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! <br>
   Jawab : Bisa , sebagai contoh Konstruktor pertama tanpa argumen yang akan menginisialisasi atribut nama dan nim dengan nilai default yang belum ditentukan. Konstruktor kedua dengan dua parameter nama dan nim yang akan menginisialisasi atribut nama dan nim dengan nilai yang diberikan saat membuat objek.
2. Jika diketahui terdapat class Segitiga seperti berikut ini: Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. <br>
   Jawab :

```java
public segitiga11(int a, int t) {
        alas = a;
        tinggi = t;
    }
```

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring).<br>
   Jawab :

```java
public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
```

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:<br>
   sgArray ke-0 alas: 10, tinggi: 4<br>
   sgArray ke-1 alas: 20, tinggi: 10 <br>
   sgArray ke-2 alas: 15, tinggi: 6 <br>
   sgArray ke-3 alas: 25, tinggi: 10 <br>
   Jawab :

```java
sgArray[0] = new segitiga11(10,4);
       sgArray[1] = new segitiga11(20,10);
       sgArray[2] = new segitiga11(15,6);
       sgArray[3] = new segitiga11(25,10);
```

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling(). <br>
   Jawab :

```java
for  (int i=0;i<sgArray.length;i++) {
            System.out.println("Luas Segitiga ke-" +i + " adalah "+sgArray[i].hitungLuas() +" dan keliling segitiga adalah " + sgArray[i].hitungKeliling());
        }
```

<br>Hasil<br>

![alt text](image-7.png)

## 3.5 Latihan Praktikum

### Soal 1

Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atributatribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan,
a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut. b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan tinggi limas
d. Pada bola, inpuntan untuk atribut hanya jari-jari <br>
Jawab :<br>
<b>Class Kerucut<b><br>

```java
package Pertemuan3.code;

public class kerucut11 {
    public int jari;
    public int sisiMiring;



    public double hitungLuasKerucut(){
        return  ((3.14 * jari * sisiMiring) + (3.14*jari*jari));
    }

    public double hitungVolumeKerucut(){
        return ((3.14 * jari * jari * sisiMiring)/3);
    }
}
```

<br>

Class LimasSegiEmpat<br>

```java
package Pertemuan3.code;

public class limasSegiEmpat11 {
   public int panjangSisiAlas;
   public int tinggi;



   public double  hitungLuasLimas(){
       return((panjangSisiAlas*panjangSisiAlas) + 4 * (1/2 * panjangSisiAlas * tinggi));
   }

   public double hitungVolumeLimas(){
       return (1.0/3 * panjangSisiAlas * panjangSisiAlas * tinggi);
   }
}
```

<br>

Class Bola<br>

```java
package Pertemuan3.code;

public class bola11 {
    public int jari;

    bola11(){

    }


    public double hitungLuasBola(){
        return (4 * 3.14 * jari);
    }

    public double hitungVolumeBola(){
        return (4/3 * 3.14 * jari * jari * jari);

    }
 }
```

<br>
Class LatihanMain111

```java
package Pertemuan3.code;
import java.util.Scanner;
public class Latihan111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukan Jumlah Bangun Ruang Kerucut Yang Ingin dihitung : ");
        kerucut11[] krc = new kerucut11[input11.nextInt()];


        for (int i = 0 ; i < krc.length; i++) {
            krc[i] = new kerucut11();
            System.out.print("Masukan jari-jari : ");
            krc[i].jari = input11.nextInt();
            System.out.print("Masukan sisi miring : ");
            krc[i].sisiMiring=input11.nextInt();
            input11.nextLine();

        }

        for (int i = 0 ; i < krc.length; i++) {
        System.out.println("luas permukaan kerucut " + krc[i].hitungLuasKerucut() + " dan Volume Kerucut " + krc[i].hitungVolumeKerucut());
        }


        System.out.print("Masukan Jumlah Bangun Ruang Limas Yang Ingin dihitung : ");
        limasSegiEmpat11[] lms = new limasSegiEmpat11[input11.nextInt()];
        for (int i = 0 ; i < lms.length; i++) {
            lms[i] = new limasSegiEmpat11();
            System.out.print("Masukan sisi alas : ");
            lms[i].panjangSisiAlas = input11.nextInt();
            System.out.print("Masukan tinggi limas : ");
            lms[i].tinggi=input11.nextInt();
            input11.nextLine();

        }

        for (int i = 0 ; i < lms.length; i++) {
            System.out.println("luas permukaan Limas " + lms[i].hitungLuasLimas() + " dan Volume Limas " + lms[i].hitungVolumeLimas());
            }

            System.out.print("Masukan Jumlah Bangun Ruang Bola Yang Ingin dihitung : ");
            bola11[] bl = new bola11[input11.nextInt()];
            for (int i = 0 ; i < bl.length; i++) {
                bl[i] = new bola11();
                System.out.print("Masukan jari-jari : ");
                bl[i].jari = input11.nextInt();
            }

            for (int i = 0 ; i < bl.length; i++) {
                System.out.println(" luas permukaan bola " + bl[i].hitungLuasBola() + " dan volume Bola " + bl[i].hitungVolumeBola());
                }


    }

}
```

### Output Program

![alt text](image-3.png)<br>

### Soal 2

Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. <br>
Jawab :<br>
Class Mahasiswa11

```java
package Pertemuan3.code;

public class Mahasiswa11 {
    String nama;
    String nim;
    char  jenisKelamin;
    double ipk;

```

<br>class MahasiswaMain11

```java
package Pertemuan3.code;
import java.util.Scanner;
public class MahasiswaMain11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukan data mahasiswa yang ingin dimasukan : " );
        int data = input11.nextInt();

        Mahasiswa11[] mhs = new  Mahasiswa11[data];

        for (int i = 0 ; i < mhs.length; i++){
            mhs[i] = new Mahasiswa11();
            System.out.println("Masukan data mahasiswa ke - " + (i+1));
            System.out.print("Masukan nama :");
            mhs[i].nama = input11.next();
            System.out.print("Masukan NIM : ");
            mhs[i].nim = input11.nextLine();
            System.out.print("Masukan Jenis Kelamin : ");
            mhs[i].jenisKelamin=input11. next().charAt(0);
            System.out.print("Masukan IPK : ");
            mhs[i].ipk= input11.nextDouble();
        }

        for(int i = 0 ; i <mhs.length;i++){
            System.out.println("Data mahasiswa ke - " + (i+1));
            System.out.println("nama : " + mhs[i].nama);
            System.out.println("nim : " + mhs[i].nim);
            System.out.println("Jenis kelamin : " + mhs[i].jenisKelamin);
            System.out.println("Nilai IPK : " + mhs[i].ipk);
        }
```

### Output Program

![<alt text>](image-4.png)<br>

### Soal 3

Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing proses tersebut) <br>
Jawab :
Tambahan Method<br>

```java
public double rataIPK(Mahasiswa11[] mhs) {
        double totalIPK = 0;
        for (int i = 0; i < mhs.length; i++) {
            Mahasiswa11 mahasiswa = mhs[i];
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }

    public void ipkTertinggi(Mahasiswa11[] mhs) {
        Mahasiswa11 mahasiswaIPKTertinggi = mhs[0];
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ipk > mahasiswaIPKTertinggi.ipk) {
                mahasiswaIPKTertinggi = mhs[i];
            }
        }
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        System.out.println("Nama: " + mahasiswaIPKTertinggi.nama);
        System.out.println("NIM: " + mahasiswaIPKTertinggi.nim);
        System.out.println("Jenis Kelamin: " + mahasiswaIPKTertinggi.jenisKelamin);
        System.out.println("IPK: " + mahasiswaIPKTertinggi.ipk);
    }
```

<br>Tambahan dimain

```java
 System.out.println("rata-rata IPK : " + mhs[0].rataIPK(mhs));
        mhs[0].ipkTertinggi(mhs);
```

### Output Program

![alt text](image-5.png)
