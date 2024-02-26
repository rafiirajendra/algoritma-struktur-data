# Laporan Praktikum Pertemuan 3
#### Nama    : Muhammad Rafi Rajendra
#### Kelas   : TI-1H
#### NIM     : 2341720158

## 3.1 Tujuan Praktikum
Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Memahami dan menjelaskan fungsi array yang berisikan variabel objek.
2. Mahasiswa mampu menangkap logika tentang permasalahan array of object dalam Java
3. Mahasiswa mampu menerapkan pembuatan array of object dalam Java
## 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
**Waktu: 50 menit**
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array dari object, 
kemudian mengisi dan menampilkan array tersebut.
### 3.2.1 Langkah-langkah Percobaan
1. Buat Project baru, dengan nama “ArrayObjects”.
2. Buat class PersegiPanjang:
    ```java
    public class PersegiPanjang {
        public int panjang;
        public int lebar;
    }
    ```
3. Pada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi 3 
elemen:
    ```java
    public static void main(String[] args) {
            PersegiPanjang[] ppArray = new PersegiPanjang[3];
    }
    ```
4. Kemudian isikan masing-masing atributnya:
    ```java
            PersegiPanjang[] ppArray = new PersegiPanjang[3];

            ppArray[0] = new PersegiPanjang();
            ppArray[0].panjang = 110;
            ppArray[0].lebar = 30;

            ppArray[1] = new PersegiPanjang();
            ppArray[1].panjang = 80;
            ppArray[1].lebar = 40;

            ppArray[2] = new PersegiPanjang();
            ppArray[2].panjang = 100;
            ppArray[2].lebar = 20;
    ```
5. Cetak ke layar semua atribut dari objek ppArray:
    ```java
            System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
            System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
            System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    ```
6. Jalankan dan amati hasilnya.

    ![alt text](<Screenshot 2024-02-26 093212.png>)

### 3.2.2 Verifikasi Hasil Percobaan
Cocokkan hasil compile kode program anda dengan gambar berikut ini.
![alt text](<Screenshot 2024-02-26 093331.png>)

![alt text](<Screenshot 2024-02-26 093212.png>)

### 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!

    Jawab: class yang akan dibut array of object tidak harus dan selalu memiliki atribut dan method. Class yang dibut array of object hanya perlu memiliki konstruktor saja yang digunakan untuk membuat objek dari class tersebut.

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
![alt text](<p2 3.2.3.png>)
Jawab: pada class PersegiPanjang tidak memiliki konstruktor, dilakukan pemanggilan konstruktor karena agar bisa terhubung dengan ArrayObject.
3. Apa yang dimaksud dengan kode berikut ini:
![alt text](<p3 3.2.3.png>)
Jawab: kode tersebut adalah kode untuk membuat array dengan nama PersegiPanjang dengan panjang array 3.
4. Apa yang dimaksud dengan kode berikut ini:
![alt text](<p4 3.2.3.png>)
Jawab: kode tersebut adalah kode untuk mengisi atribut pada masing-masing index pada array.
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
Jawab: agar lebih mudah dan lebih rapi.

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping
**Waktu: 50 menit**
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi yang ada di ppArray.

### 3.3.1 Langkah-langkah Percobaan
1. Import scanner pada class ArrayObjects.
Note: Letakkan kode import dibawah kode package.
![alt text](<langkah1 3.3.1.png>)
    ```java
    import java.util.Scanner;
    public class ArrayObjects {
    }
    ```
2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek.

    **Scanner** untuk menerima input, kemudian melakukan looping untuk menerima input:
![alt text](<langkah2 3.3.1.png>)
    ```java
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                ppArray[i] = new PersegiPanjang();
                System.out.println("Persegi Panjang ke-" + i);
                System.out.print("Masukkan panjang: ");
                ppArray[i].panjang = sc.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray[i].lebar = sc.nextInt();
            }
    ```
3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping 
untuk mengakses isi array ppArray dan menampilkannya ke layar: 
![alt text](<langkah3 3.3.1.png>)
    ```java
            for (int i = 0; i < 3; i++) {
                System.out.println("Persegi panjang ke-" + i);
                System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
            }
    ```
4. Jalankan dan amati hasilnya.

    ![alt text](<hasil 3.3.1.png>)
### 3.3.2 Verifikasi Hasil Percobaan
Contoh verifikasi hasil percobaan ini.

![alt text](<hasil 3.3.1.png>)

### 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

    Jawab: Bisa, array of obeject dapat diimplementasikan pada array 2 Dimensi.
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

    Jawab:  
    
    ```java
        import java.util.Scanner;
        public class ArrayObjects {
            public static void main(String[] args) {
                PersegiPanjang[][] ppArray = new PersegiPanjang[3][2];

                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < 3; i++) {
                    ppArray[i][0] = new PersegiPanjang();
                    System.out.println("Persegi Panjang ke-" + i);
                    System.out.print("Masukkan panjang: ");
                    ppArray[i][0].panjang = sc.nextInt();
                    ppArray[i][1] = new PersegiPanjang();
                    System.out.print("Masukkan lebar: ");
                    ppArray[i][1].lebar = sc.nextInt();
                }

                for (int i = 0; i < 3; i++) {
                    System.out.println("Persegi panjang ke-" + i);
                    System.out.println("Panjang: " + ppArray[i][0].panjang + ", Lebar: " + ppArray[i][1].lebar);
                }
            }
        }
    ```
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?

    ![alt text](<p3 3.3.3.png>)
    Jawab: kode tersebut memunculkan error saat dijalankan karena tidak ada object Persegi yang di inisialisasi pada setiap elemen dalam array tersebut.
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!

    Jawab:

    ```java
    import java.util.Scanner;
    public class ArrayObjects {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.print("Masukkan banyaknya persegi: ");
            int banyak = a.nextInt();
            PersegiPanjang[] ppArray = new PersegiPanjang[banyak];

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                ppArray[i] = new PersegiPanjang();
                System.out.println("Persegi Panjang ke-" + i);
                System.out.print("Masukkan panjang: ");
                ppArray[i].panjang = sc.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray[i].lebar = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Persegi panjang ke-" + i);
                System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
            }
        }
    }
    ```
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

    Jawab: boleh saja jika terjadi duplikasi instansiasi array of objek tetapi harus hati-hati dalam penggunaannya karena data yang ada pada sebelumnya akan terganti dengan data yang baru.
## 3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method
**Waktu: 50 menit**
Pada praktikum ini kita akan melakukan pengoperasian matematika beberapa atribut pada 
masing-masing anggota array.
### 3.4.1 Langkah-langkah Percobaan
1. Buat package baru “ArrayBalok”.

2. Buat class Balok:
![alt text](<langkah 2 3.4.png>)

    ```java
    public class Balok {
        public int panjang;
        public int lebar;
        public int tinggi;

        public Balok(int p, int l, int t){
            panjang = p;
            lebar = l;
            tinggi = t;
        }

        public int hitungVolume(){
            return panjang * lebar * tinggi;
        }
    }
    ```
3. Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen:
![alt text](<langkah 3 3.4.png>)
    ```java
    public class ArrayBalok {
        public static void main(String[] args) {
            Balok[] blArray = new Balok[3];
        }
    }
    ```
4. Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor 
dari class Balok:
![alt text](<langkah 4 3.4.png>)
    ```java
            blArray[0] = new Balok(100, 30, 12);
            blArray[1] = new Balok(120, 40, 15);
            blArray[2] = new Balok(210, 50, 25);
    ```
5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di 
dalam looping seperti berikut ini:
![alt text](<langkah 5 3.4.png>)
    ```java
            for (int i = 0; i < 3; i++) {
                System.out.println("Volume balok ke " + i + " : " + blArray[i].hitungVolume());
            }
    ```
6. Jalankan dan amati hasilnya.

    ![alt text](<hasil 3.4.png>)
### 3.4.2 Verifikasi Hasil Percobaan
Cocokkan hasil compile kode program anda dengan gambar berikut ini.
![alt text](<verif 3.4.png>)

![alt text](<hasil 3.4.png>)
### 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

    Jawab: konstruktor dapat bejumlah lebih dalam setu kelas. 
    contoh : 
    ```java
        public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
    ```
    pada contoh tersebut terdapat 2 konstruktor yang pertama Balok(int p, int l, int t) dan yang kedua hitungVolume().
2. Jika diketahui terdapat class Segitiga seperti berikut ini:

    ![alt text](<p2 3.4.png>)
    Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

    Jawab: 
    ```java
    public class Segitiga {
    public static String hitungLuas;
    public int alas;
    public int tinggi;
    }
    ```
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan 
library Math pada Java untuk mengkalkulasi sisi miring)
    
    Jawab:
    ```java
        public int hitungLuas(){
        return alas * tinggi /2;
    }

    public double hitungKeliling(){
        return alas + tinggi + Math.hypot(tinggi, alas);
    }
    ```

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10

    Jawab:
    ```java
    sgArray[0] = new Segitiga(10, 4);
    sgArray[1] = new Segitiga(20, 10);
    sgArray[2] = new Segitiga(15, 6);
    sgArray[3] = new Segitiga(25, 10);
    ```

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().

    Jawab:
    ```java
    for (int i = 0; i < sgArray.length; i++) {
        System.out.println("Segitiga ke " + i);
        System.out.println("Luas "+ sgArray[i].hitungLuas() + ", Keliling " + sgArray[i].hitungKeliling());
    }
    ```
    ![alt text](<hasil segitiga.png>)

## 3.5 Latihan Praktikum
**Waktu: 150 menit**
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, 
limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun 
ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atribut-atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan,

    ***a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan 
    luas permukaan dan volume dari tiap jenis bangun ruang tersebut.***

    ***b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring***

    ***c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan 
    tinggi limas***

    ***d. Pada bola, inpuntan untuk atribut hanya jari-jari***
2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, 
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika 
dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:

    ![alt text](<soal lat.png>)
3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, 
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing 
proses tersebut)