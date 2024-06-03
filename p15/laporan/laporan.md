# Laporan Praktikum Pertemuan 10
#### Nama    : Muhammad Rafi Rajendra
#### Kelas   : TI-1H
#### NIM     : 2341720158

# <p align="center">JOBSHEET 15</p>
# <p align="center">GRAPH</p>

# 1. Tujuan Praktikum

Setelah melakukan praktikum ini, mahasiswa mampu: 
    1. memahami model graph 
    2. membuat dan mendeklarasikan struktur algoritma graph 
    3. menerapkan algoritma dasar graph dalam beberapa studi kasus 

# 2. Praktikum

## 2.1  Percobaan 1: Implementasi Graph menggunakan Linked List**

Sebuah universitas membuat program untuk memodelkan graf **berarah berbobot** yang mewakili gedung-gedung dan jarak antar gedung tersebut menggunakan Linked List. Setiap gedung dihubungkan dengan jalan yang memiliki jarak tertentu (dalam meter). Perhatikan class diagram Graph berikut ini. 

![alt text](image-2.png)

### 2.1.1 Langkah-langkah Percobaan 
**Waktu percobaan (90 menit)**

1. Buka text editor. Buat class Node<NoAbsen>.java dan DoubleLinkedList<NoAbsen>.java sesuai dengan praktikum Double Linked List.  
    **A. Class Node**

    Kode program yang terdapat pada class Node belum dapat mengakomodasi kebutuhan 
    pembuatan graf berbobot, sehingga diperlukan sedikit modifikasi. Setelah Anda menyalin 
    kode program dari class Node pada praktikum Double Linked List, tambahkan atribut jarak 
    bertipe int untuk menyimpan bobot graf.

    ```java
    int data;
    Node19 prev, next;
    int jarak;

    Node19(Node19 prev, int data, int jarak, Node19 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
    ```
    **B. Class DoubleLinkedList**

    Setelah Anda menyalin kode program dari class DoubleLinkedList pada praktikum Double 
    Linked List, lakukan modifikasi pada method addFirst agar dapat menerima parameter jarak 
    dan digunakan saat instansiasi Node

    ```java
    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node19(null, item, jarak, null);
        } else {
            Node19 newNode = new Node19(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    ```
    Selanjutnya buat method getJarak (hampir sama seperti method get) yang digunakan untuk mendapatkan nilai jarak edge antara dua node.

    ```java
    public int getJarak(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        }
        Node19 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    ```

    Modifikasi method remove agar dapat melakukan penghapusan edge sesuai dengan node asal dan tujuan pada graf. Pada praktikum Double Linked List, parameter index digunakan untuk menghapus data sesuai posisi pada indeks tertentu, sedangkan pada Graf ini, penghapusan didasarkan pada data node tujuan, sehingga modifikasi kode diperlukan untuk menghindari index out of bound.

    ```java
    public void remove(int index){
        if (isEmpty() || index >= size) {
            System.out.println("Nilai index di luar batas");
        } else if (index == 0) {
            head = head.next;
            head.prev = null;
        } else {
            Node19 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        size--;
    }
    ```
    **C. Class Graph**

    2. Buat file baru, beri nama Graph<NoAbsen>.java 
    3. Lengkapi class Graph dengan atribut yang telah digambarkan di dalam pada class diagram, yang terdiri dari atribut vertex dan DoubleLinkedList

    ```java
    int vertex;
    DoubleLinkedLists list[];
    ```
    4. Tambahkan konstruktor default untuk menginisialisasi variabel vertex dan menambahkan perulangan jumlah vertex sesuai dengan panjang array yang telah ditentukan.

    ```java
    public Graph19(int v){
        vertex = v;
        list = new DoubleLinkedLists[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }
    ```
    5. Tambahkan method addEdge() untuk menghubungkan dua node. Baris kode program berikut digunakan untuk graf berarah (directed). 

    ```java
    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }
    ```
    Apabila graf yang dibuat adalah undirected graph, maka tambahkan kode berikut. 
    ```java
    list[tujuan].addFirst(asal, jarak);
    ```
    6. Tambahkan method degree() untuk menampilkan jumlah derajat lintasan pada setiap vertex. Kode program berikut digunakan untuk menghitung degree pada graf berarah

    ```java
    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' +asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' +asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' +asal) + ": " + (totalIn + totalOut));
    }
    ```
    Apabila graf yang dibuat adalah undirected graph, maka cukup gunakan kode berikut. 

    ```java
    System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    ```

    7. Tambahkan method removeEdge() untuk menghapus lintasan pada suatu graph. Penghapusan membutuhkan 2 parameter yaitu node asal dan tujuan.

    ```java
    public void removeEdge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }
    ```
    8. Tambahkan method removeAllEdges() untuk menghapus semua vertex yang ada di dalam  graf.
    
    ```java
    public void removeAllEdge(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
    }
    ```
    9. Tambahkan method printGraph() untuk mencetak graf.
    
    ```java
    public void printGraph()throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    ```

    **D. Class Utama**

    10. Buat file baru, beri nama GraphMain<NoAbsen>.java 
    11. Tuliskan struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main 
    12. Di dalam fungsi main, lakukan instansiasi object Graph bernama gedung dengan nilai parameternya adalah 6. 
    
    ```java
    Graph19 gedung = new Graph19(6);
    ```
    13. Tambahkan beberapa edge pada graf, tampilkan degree salah satu node, kemudian tampilkan grafnya. 

    ```java
        Graph19 gedung = new Graph19(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
    ```

    14. Compile dan run program. 
        Catatan: Degree harus disesuaikan dengan jenis graf yang digunakan. Pada kasus ini, digunakan directed weighted graph 
    15. Tambahkan pemanggilan method removeEdge(), kemudian tampilkan kembali graf tersebut. 

    ```java
    gedung.remove(1, 3);
    gedung.printGraph();
    ```
    16. Commit dan push kode program ke Github 
    17. Compile dan run program. 


### 2.1.2 Verifikasi Hasil Percobaan 
Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini.

**Hasil running pada langkah 14**

![alt text](image.png)

**Hasil running pada langkah 17**

![alt text](image-1.png)

### 2.1.3 Pertanyaan 
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut! 
3. Jelaskan alur kerja dari method removeEdge! 
4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph? 
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). 