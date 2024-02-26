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
Waktu: 50 menit
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

    Jawab: 

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
![alt text](<p2 3.2.3.png>)
Jawab: 
3. Apa yang dimaksud dengan kode berikut ini:
![alt text](<p3 3.2.3.png>)
Jawab: 
4. Apa yang dimaksud dengan kode berikut ini:
![alt text](<p4 3.2.3.png>)
Jawab:
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
Jawab: 

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping
Waktu: 50 menit
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi yang ada di ppArray.

### 3.3.1 Langkah-langkah Percobaan
1. Import scanner pada class ArrayObjects.
Note: Letakkan kode import dibawah kode package.
2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek 
Scanner untuk menerima input, kemudian melakukan looping untuk menerima input:
3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping 
untuk mengakses isi array ppArray dan menampilkannya ke layar: 
4. Jalankan dan amati hasilnya.
3.3.2 Verifikasi Hasil Percobaan
Contoh verifikasi hasil percobaan ini.

### 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa?
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !