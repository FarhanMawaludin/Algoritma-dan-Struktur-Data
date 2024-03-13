# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>

## <p align ="center"> PERTEMUAN IV <br> BRUTE FORCE DAN DIVIDE CONQUER </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Farhan Mawaludin </p>
<p align = "center"> NIM   : 2341720258 </p>
<p align = "center"> Prodi : TEKNIK INFORMATIKA</p>
<p align = "center"> Kelas : 1B </p>
<br><br>

## 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

<b>kode class</b>
<br>

```java
package Pertemuan5;

public class faktorial11 {
    public int nilai;

    int faktorialBF(int n){
        int fakto = 1;
        for ( int i = 1 ; i <=n ; i++ ){
        fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDC(int n){
        if (n==1){
            return 1;
        }else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
```

<b>kode Main</b>
<br>

```java
package Pertemuan5;

import java.util.Scanner;
public class MainFaktorial11 {
    public static void main(String[] args) {

        Scanner input11 = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Masukan Jumlah Elemen: ");
        int ijml = input11 . nextInt();

        faktorial11[] fk = new faktorial11[ijml];
        for (int i = 0 ; i < fk.length ; i++){
            fk[i]= new faktorial11();
            System.out.println("Masukan nilai data ke-" +(i+1) + " :");
            fk[i].nilai = input11.nextInt();

        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < fk.length
        ; i++){
            System.out.println(" Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i = 0; i < fk.length
        ; i++){
            System.out.println(" Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialDC(fk[i].nilai));
        }

    }

}
```

<b>Output Kode</b><br>

![alt text](image.png)

### 4.2.3 Pertanyaan

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
   perbedaan bagian kode pada penggunaan if dan else!<br>
   Jawab : penggunaan if disini sebagai base case jadi jika saat di cek n=1 maka akan berhenti da mereturnkan 1, tapi else disini sebgai fungsi rekursif ketika pada saaat n tidak sama dengan 1 maka akan dieksekusi sampai nilai n kembali kepada base case.
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
   for?Buktikan! <br>
   Jawab :
3. Jelaskan perbedaan antara fakto _= i; dan int fakto = n _ faktorialDC(n-1); !<br>
   Jawab :
