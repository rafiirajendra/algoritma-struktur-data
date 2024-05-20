package Kuis_2.Klasemen;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("++++ KLASEMEN IBL 2024 ++++");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("1. Tambah tim");
        System.out.println("2. Hapus tim");
        System.out.println("3. Cari tim");
        System.out.println("4. Tampilkan klasemen");
        System.out.println("5. Keluar");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        Point hitungPoint = new Point();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama tim: ");
                    String tim = sc.nextLine();
                    System.out.print("Masukkan jumlah menang: ");
                    int menang = sc.nextInt();
                    System.out.print("Masukkan jumlah kalah: ");
                    int kalah = sc.nextInt();
                    int points = hitungPoint.calculatePoints(menang, kalah);
                    System.out.print("Tambah di awal atau akhir? (1: Awal, 2: Akhir): ");
                    int posisi = sc.nextInt();
                    
                    if (posisi == 1) {
                        list.addFirst(tim, points);
                    } else {
                        list.addLast(tim, points);
                    }
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Tidak ada tim yang dihapus mungkin typo");
                    }
                    System.out.print("Masukkan Tim yang ingin dihapus : ");
                    String hapus = sc.nextLine();
                    list.remove(hapus);
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Tidak ada tim yang dicari mungkin typo");
                    }
                    System.out.print("Masukkan Tim yang ingin dicari : ");
                    String cari = sc.nextLine();
                    list.search(cari);
                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("Tidak ada tim yang ditambahkan");
                        break;
                    }
                    list.print();
                    break;
                case 5:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 5);
    }
}

