# Laporan Praktikum Pertemuan 6
#### Nama    : Muhammad Rafi Rajendra
#### Kelas   : TI-1H
#### NIM     : 2341720158

## JOBSHEET VII
## STACK
1. Tujuan Praktikum 

    Setelah melakukan materi praktikum ini, mahasiswa mampu:
    1. Membuat struktur data Stack
    2. Menerapkan algoritma Stack ke dalam program
2. Praktikum
## 2.1 Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang
Waktu Percobaan : 90 Menit
Sejumlah barang akan disimpan ke dalam gudang secara bertumpuk dengan menerapkan prinsip 
Stack. Perhatikan Class Diagram Barang berikut ini:

![alt text](image.png)

Selanjutnya, untuk menyimpan barang di dalam gudang, diperlukan class Gudang yang berperan 
sebagai Stack tempat penyimpanan data barang. Atribut dan method yang terdapat di dalam class 
Gudang merepresentasikan pengolahan data menggunakan struktur Stack. Perhatikan Class Diagram 
Gudang berikut ini:

![alt text](image-1.png)

Catatan: Tipe data pada variabel tumpukan menyesuaikan dengan data yang akan disimpan di 
dalam Stack. Pada percobaan ini, data yang akan disimpan merupakan array of object dari Barang, 
sehingga tipe data yang digunakan adalah Barang.

Berdasarkan dua class diagram tersebut, program menggunakan bahasa Java

### 2.1.1 Langkah-langkah Percobaan

        1. Class Barang
1. Buka text editor. Buat file baru, beri nama Barang<NoAbsen>.java
2. Lengkapi class Barang dengan atribut yang telah digambarkan di dalam class diagram Barang, 
yang terdiri dari atribut kode, nama, dan kategori
3. Tambahkan konstruktor berparameter pada class Barang sesuai dengan class diagram Barang

        2. Class Gudang
4. Setelah membuat class Barang, selanjutnya perlu dibuat class Gudang<NoAbsen>.java sebagai 
tempat untuk mengelola tumpukan barang. Class Gudang merupakan penerapan dari Stack
5. Lengkapi class Gudang dengan atribut yang telah digambarkan di dalam class diagram Gudang, 
yang terdiri dari atribut tumpukan, size, dan top

    ```java
    barang19[] tumpukan;
    int size, top;
    ```
6. Tambahkan konstruktor berparameter pada class Gudang untuk melakukan inisialisasi kapasitas 
maksimum data barang yang dapat disimpan di dalam stack, serta mengeset indeks awal dari 
pointer top

    ```java
    public gudang19(int kapasitas){
        size = kapasitas;
        tumpukan = new barang19[size];
        top = -1;
    }
    ```
7. Pada class Gudang, buat method cekKosong bertipe boolean untuk mengecek apakah tumpukan 
barang di dalam gudang masih kosong

    ```java
    public boolean cekKosong(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    ```
8. Selanjutnya, buat method cekPenuh bertipe boolean untuk mengecek apakah tumpukan barang 
di dalam gudang sudah terisi penuh sesuai kapasitas

    ```java
    boolean cekPenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    ```
9. Untuk dapat menambahkan barang ke dalam tumpukan di gudang, maka buat method 
tambahBarang yang merepresentasikan push. Method ini menerima parameter brg yang berupa 
object Barang

    ```java
    public void tambangBarang(barang19 barang){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = barang;
            System.out.println("Barang " + barang.nama + " berhasil di tambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }
    ```
10. Pengambilan barang dari tumpukan di gudang dilakukan dengan menggunakan method 
ambilBarang yang merepresentasikan pop. Method ini tidak menerima parameter apapun karena 
barang yang diambil atau dikeluarkan pasti berada di posisi teratas

    ```java
    public barang19 ambilBarang(){
        if (!cekKosong()) {
            barang19 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    ```
    Catatan: Apabila diperlukan informasi mengenai data barang yang diambil, maka tipe kembalian 
    harus berupa object Barang. Sebaliknya, tipe kembalian void dapat digunakan jika data barang 
    yang dikeluarkan tidak akan diolah atau digunakan lagi

11. Buat method lihatBarangTeratas yang merepresentasikan peek untuk dapat mengecek 
tumpukan barang di posisi paling atas

    ```java
    public barang19 lihatBarangTeratas(){
        if (!cekKosong()) {
            barang19 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    ```
12. Tambahkan method tampilkanBarang untuk dapat menampilkan semua rincian tumpukan 
barang di gudang

    ```java
    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang.");
            //for (int i = top; i > 0; i--){}
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n" , tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
    ```
        3. Class Utama
13. Buat file baru, beri nama Utama<NoAbsen>.java
14. Tuliskan struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main
15. Di dalam fungsi main, lakukan instansiasi object Gudang bernama gudang dengan nilai 
parameternya adalah 7.

    ```java
    gudang19 gudang = new gudang19(7);
    ```
16. Deklarasikan Scanner dengan nama variabel scanner
17. Tambahkan menu untuk memfasilitasi pengguna dalam memilih operasi Stack dalam mengelola 
data barang di gudang menggunakan struktur perulangan While

    ```java
    while (true) {
        System.out.println("\n Menu: ");
        System.out.println("1. Tambahkan barang");
        System.out.println("2. Ambil barang");
        System.out.println("3. Tampilkan semua barang");
        System.out.println("4. keluar");
        System.out.print("Pilih operasi: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukan kode barang: ");
                int kode = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukan nama barang: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan nama kategori: ");
                String kategori = scanner.nextLine();
                barang19 barangBaru = new barang19(kode, nama, kategori);
                gudang.tambangBarang(barangBaru);
                break;

            case 2:
                gudang.ambilBarang();
                break;
            case 3:
                gudang.tampilkanBarang();
                break;
            case 4:
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
    ```
18. Commit dan push kode program ke Github
19. Compile dan run program.

### 2.1.2 Verifikasi Hasil Percobaan

![alt text](<verif percobaan 1.png>)

### 2.1.3 Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?

    jawab: bagian yang diperlu diperbaiki yaitu pada class barang19.java dan gudang19.java. Untuk class barang19.java menambahkan paramater this. Untuk class gudang19 perbaikan pada method tampilkan barang yaitu merubah pada perulangan yang awalnya 

    ```java
    for(int i = 0; i <= top; i++>)
    ```

    menjadi

    ```java
    for(int i = top; i >= 0; i--)
    ```

2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya!

    jawab: jumlah maksimum data barang yang dapat disimpan dalam tumpukan ditentukan oleh parameter size yang dilewatkan saat membuat objek baru. Parameter size mengatur kapasitas dari array yang menyimpan barang-barang tersebut. Berikut adalah potongan kode dari konstruktor gudang19 di mana ukuran array tumpukan ditentukan:

    ```java
    public gudang19(int kapasitas){
    size = kapasitas;
    tumpukan = new barang19[size];
    top = -1;
    }
    ```
    Pada konstruktor ini, kapasitas adalah parameter yang menentukan berapa banyak item yang dapat ditampung oleh tumpukan (stack). Sebagai contoh, dalam kelas utama utama19, sebuah gudang19 baru dengan kapasitas 7 dibuat:

    ```java
    gudang19 gudang = new gudang19(7);
    ```
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?

    jawab: pengecekan kondisi !cekKosong() pada method tampilkanBarang() diperlukan untuk memastikan bahwa tumpukan (tumpukan) tidak kosong sebelum mencoba menampilkan barang-barang di dalamnya. Jika kondidi !cekKosong() dihilangkan yang terjadi adalah akan muncul NullPointerException karena mencoba mengakses properti dari objek null.
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!

    jawab: 

    menambahkan opsi untuk melihat barang teratas

    ```java
       while (true) {
            System.out.println("\n Menu: ");
            System.out.println("1. Tambahkan barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Tampilkan semua barang");
            System.out.println("5. keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    barang19 barangBaru = new barang19(kode, nama, kategori);
                    gudang.tambangBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    ```

    merubah code program agar pengguna dapat menentukan secara bebas kapasitas gudang

    ```java
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Masukkan kapasitas gudang: ");
    int kapasitas = scanner.nextInt();

    gudang19 gudang = new gudang19(kapasitas);
    ```
5. Commit dan push kode program ke Github