# Laporan Praktikum Pertemuan 10
#### Nama    : Muhammad Rafi Rajendra
#### Kelas   : TI-1H
#### NIM     : 2341720158

## <p align="center">JOBSHEET XI</p>
## <p align="center">LINKED LIST</p>

## 1. Tujuan Praktikum
Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Membuat struktur data linked list
2. Membuat linked list pada program
3. Membedakan permasalahan apa yang dapat diselesaikan menggunakan linked list

## 2. Praktikum
### 2.1 Pembuatan Single Linked List
**Waktu percobaan : 30 menit**

Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat Single Linked List dengan 
representasi data berupa Node, pengaksesan linked list dan metode penambahan data.
1. Pada Project StrukturData yang sudah dibuat pada Minggu sebelumnya, buat package dengan 
nama minggu11
2. Tambahkan class-class berikut:
a. Node.java
b. SingleLinkedList.java
c. SLLMain.java
3. Implementasi class Node
    ```java
    Node (int nilai, Node berikutnya){
        data = nilai;
        next = berikutnya;
    }
    ```
4. Tambahkan atribut pada class SingleLinkedList
    ```java
    Node head, tail;
    ```
5. Sebagai langkah berikutnya, akan diimplementasikan method-method yang terdapat pada 
SingleLinkedList.
6. Tambahkan method isEmpty().
    ```java
    boolean isEmpty() {
        return head == null;
    }
    ```
7. Implementasi method untuk mencetak dengan menggunakan proses traverse.
    ```java
    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    ```
8. Implementasikan method addFirst().
    ```java
    void addFirst(int input) {
        Node ndInput = new Node(input, head);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
        }
    }
    ```
9. Implementasikan method addLast().
    ```java
    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
        } else {
            tail.next = ndInput;
        }
        tail = ndInput;
    }
    ```
10. Implementasikan method insertAfter, untuk memasukkan node yang memiliki data 
input setelah node yang memiliki data key.
    ```java
    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, head);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break; 
            }
            temp = temp.next;
        }        
    }
    ```
11. Tambahkan method penambahan node pada indeks tertentu.
    ```java
    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("index harus >= 0");
            return;
        }
        if (index == 0) {
            addFirst(input);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        Node ndInput = new Node(input, temp.next);
        temp.next = ndInput;
        if (ndInput.next == null) {
            tail = ndInput; 
        }
    }
    ```
12. Pada class SLLMain, buatlah fungsi main, kemudian buat object dari class SingleLinkedList.
    ```java
    public class SLLMain {
        public static void main(String[] args) {
            SingleLinkList singLL = new SingleLinkList();
        }
    }
    ```
13. Tambahkan Method penambahan data dan pencetakan data di setiap penambahannya agar terlihat perubahannya.
    ```java
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    ```
### 2.1.1 Verifikasi Hasil Percobaan
![alt text](image.png)

### 2.2.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
2. Jelaskan kegunaan kode dibawah pada method remov
    ```java
    else if(temp.next.data == key){
        temp.next = temp.next.next;
    }
    ```