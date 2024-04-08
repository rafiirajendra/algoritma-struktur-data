package p7.TestSearching;

import java.util.Scanner;

public class BukuMain19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        
        PencarianBuku19 data = new PencarianBuku19();
        int jumBuku = 5;
        
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("MASUKKAN DATA BUKU SECARA URUT DARI KODE BUKU TERKECIL: ");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();            
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();            
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();            
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();
            
            Buku19 m = new Buku19(kodeBuku, tahunTerbit, stock, judulBuku, pengarang);
            data.tambah(m);
        }
        
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("DATA KESELURUHAN BUKU : ");
        System.out.println("-------------------------------------------------------------------");
        data.tampil();

        int pilihan = 0;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("Menu Pilihan : ");
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Cari Data Buku Berdasarkan Kode Buku");
            System.out.println("2. Cari Data Buku Berdasarkan Judul Buku");
            System.out.println("3. Exit");
            System.out.print("Pilihan: ");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Pencarian Data : ");
                    System.out.println("Masukkan kode buku yang dicari: ");
                    System.out.print("Kode Buku : ");
                    int cari = s1.nextInt();
                    System.out.println("Menggunakan sequential Search");
                    int posisi = data.FindSeqSearch(cari);
                    data.Tampilposisi(cari, posisi);
                    data.TampilData(cari, posisi);

                    Buku19 dataBuku = data.FindBuku(cari);
                    if (dataBuku != null) {
                        dataBuku.tampilDataBuku();
                    } else {
                        System.out.println("Buku dengan kode " + cari + " tidak ditemukan.");
                    }

                    System.out.println("=========================================================");
                    System.out.println("Menggunakan binary search");
                    data.bubbleSortBuku();
                    posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
                    data.Tampilposisi(cari, posisi);
                    data.TampilData(cari, posisi);
                    break;

                case 2:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Pencarian Data : ");
                    System.out.println("Masukkan judul buku yang dicari: ");
                    System.out.print("Judul Buku : ");
                    String cariJudul = s1.nextLine();
                    System.out.println();

                    System.out.println("Menggunakan sequential Search");
                    int posisiJudul = data.findSeqSearchByJudulBuku(cariJudul);
                    data.TampilPosisiByJudulBuku(cariJudul, posisiJudul);

                    System.out.println("=========================================================");
                    System.out.println("Menggunakan binary search");
                    data.insertionSortJudulBuku();
                    posisiJudul = data.findBinarySearchByJudulBuku(cariJudul);
                    data.TampilPosisiByJudulBuku(cariJudul, posisiJudul);
                    data.TampilDataByJudulBuku(cariJudul, posisiJudul);
                    break;

                case 3:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("EXIT");
                    break;

                default:
                    System.out.println("Inputan tidak Valid");
                    break;
            }
        } while (pilihan != 3);
    }
}