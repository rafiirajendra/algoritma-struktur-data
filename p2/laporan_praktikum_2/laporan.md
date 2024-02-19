# Laporan Praktikum Pertemuan 2
#### Nama    : Muhammad Rafi Rajendra
#### Kelas   : TI-1H
#### NIM     : 2341720158

## 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method
### 2.1.1 Langkah-langkah Percobaan
1. Buka text editor. Buat file baru, beri nama Buku<NoAbsen>.java
2. Lengkapi class Buku dengan atribut yang telah digambarkan di dalam class diagram tersebut
```java

        String judul, pengarang;
        int halaman, stok, harga;

```
3. Lengkapi class Buku dengan method yang telah digambarkan di dalam class diagram tersebut
```java

        void tampilInformasi(){
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);
        }

        void terjual(int jml){
            if (stok > 0) {
                stok -= jml;
            }
        }
        
        void restock(int jml){
            stok += jml;
        }

        void gantiHarga(int hrg){
            harga = hrg;
        }

        public Buku19(){
            
        }

```

4. Compile dan run program.

### 2.1.2 Hasil Verifikasi Percobaan

![alt text](<verifikasi 2.1.2.png>)

### 2.1.3 Pertanyaan
1. Sebutkan dua karakteristik class atau object!

Jawab: Karakterisitik dari class atau object yaitu memiliki method dan atribut.

2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!

Jawab: 
- judul
- pengarang
- halaman
- stok
- harga

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!

Jawab: method yang dimiliki ada 4 yaitu tampilInformasi(), terjual(int jml), restock(int jml), gantiHarga(int hrg).

4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!

Jawab: 
```java
        void terjual(int jml){
            if (stok > 0) {
                stok -= jml;
            }
        }
```
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?

Jawab: Karena parameter int merujuk ke jumlah buku yang akan di masukkan ke stok

6. Commit dan push kode program ke Github


## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
### 2.2.1 Langkah-langlah Percobaan
1. Buat file baru, beri nama BukuMain<NoAbsen>.java
2. Tuliskan struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main()
```java

        Buku19 bk1 = new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

```
3. Di dalam fungsi main(), lakukan instansiasi, kemudian lanjutkan dengan mengakses atribut dan 
method dari objek yang telah terbentuk.
4. Compile dan run program.
5. Commit dan push kode program ke Github
### 2.2.2 Verifikasi Hasil Percobaan

![alt text](<verifikasi 2.2.2.png>)

### 2.2.3 Pertanyaan
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?

Jawab: Proses instansiasi ditunjukkan pada baris.
```java
Buku19 bk1 = new Buku19();
```
Nama object yang dihasilkan adalah bk1.

2. Bagaimana cara mengakses atribut dan method dari suatu objek?

Jawab: Untuk mengakses atribut dan method dapat menggunakan (.) setelah nama objek kemudian di ikuti nama atribut atau method yang di ingsin di akses.

3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?

Jawab: Karena terdapat perubahan atribut pada object bk1.

## 2.3 Percobaan 3: Membuat Konstruktor
### 2.3.1 Langkah-langkah Percobaan
1. Buka kembali class Buku. Tambahkan dua buah konstruktor di dalam class Buku tersebut, yang 
terdiri dari satu konstruktor default dan satu konstruktor berparameter. Konstruktor merupakan 
method Istimewa, penempatan kode program untuk konstruktor dapat diperlakukan sama 
seperti method yang lain (setelah atribut).
```java

        public Buku19(){
            
        }

        public Buku19(String jud, String pg, int hal, int stok, int har){
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }

```
2. Buka kembali class BukuMain. Buat sebuah object lagi bernama bk2 dengan menggunakan 
konstruktor berparameter.
```java

        Buku19 bk1 = new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

```
3. Compile dan run program.
4. Commit dan push kode program ke Github

### 2.3.2 Verifikasi Hasil Percobaan

![alt text](<verifikasi 2.3.2..png>)

### 2.3.3 Pertanyaan
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk 
mendeklarasikan konstruktor berparameter!

Jawab: Baris kode program yang digunakan untuk mendelkarasikan konstruktor berparameter adalah
```java
        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
```

2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
![alt text](<pertanyaan 2.3.3.png>)

Jawab: untuk pada baris tersebut melakukan membuat objek bk2 dan langsung menginisialisasi pada constructor.

3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana 
hasilnya? Jelaskan mengapa hasilnya demikian!

Jawab: konstruktor default pada class Buku jika dihapus maka akan terjadi error pada BukuMain yang bertuliskan "The constructor Buku19() is undefined'. Hasilnya demikian karena pada BukuMain19 mencoba untuk memanggil constructor default sedangkan pada Buku19 constructor default tidak ada.

4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!

Jawab: tidak, karena method dalam class Buku dapat dipanggil meskipun tidak urut,

5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor 
berparameter dari class Buku!

Jawab: 
```java
 Buku19 bukuRafi = new Buku19("Laskar Pelangi", "Andrea Hinata", 534, 19, 290000);
```
6. Commit dan push kode program ke Github

## 2.4 Latihan Praktikum
1. Pada class Buku yang telah dibuat, tambahkan tiga method yaitu hitungHargaTotal(), 
hitungDiskon(), dan hitungHargaBayar() dengan penjelasan sebagai berikut:
- Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan 
perkalian antara harga dengan jumlah buku yang terjual
- Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan berikut:
  - Jika harga total lebih dari 150000, maka harga didiskon sebesar 12%
  - Jika harga total antara 75000 sampai 150000, maka harga didiskon sebesar 5%
  - Jika harga total kurang dari 75000, maka harga tidak didiskon
- Method hitungHargaBayar() digunakan untuk menghitung harga total setelah dikurangi diskon

Class diagram Buku setelah penambahan ketiga method tersebut adalah sebagai berikut.
![alt text](<latihan soal no 1.png>)

Jawab:

2. Buat program berdasarkan class diagram berikut ini!

![alt text](<latihan soal no 2.png>)

Penjelasan dari atribut dan method pada class Dragon tersebut adalah sebagai berikut:
- Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari dragon, sedangkan 
atribut y untuk posisi koordinat y (vertikal)
- Atribut width digunakan untuk menyimpan lebar dari area permainan, sedangkan height
untuk menyimpan panjang area
- Method moveLeft() digunakan untuk mengubah posisi dragon ke kiri (koordinat x akan 
berkurang 1), sedangkan moveRight() untuk bergerak ke kanan (koordinat x akan bertambah 
1). Perlu diperhatikan bahwa koordinat x tidak boleh lebih kecil dari 0 atau lebih besar dari 
nilai width. Jika koordinat x < 0 atau x > width maka panggil method detectCollision()
- Method moveUp() digunakan untuk mengubah posisi dragon ke atas (koordinat y akan 
berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah 1). Perlu diperhatikan bahwa koordinat y tidak boleh lebih kecil dari 0 atau lebih besar dari 
nilai height. Jika koordinat y < 0 atau y > height maka panggil method detectCollision()
- Method detectCollision() akan mencetak pesan “Game Over” apabila dragon menyentuh 
ujung area permainan
