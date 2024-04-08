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
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();            
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
        System.out.println("--------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("PENCARIAN DATA : ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();
        Buku19 dataBuku19 = data.FindBuku(cari);
        dataBuku19.tampilDataBuku();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        s.close();
        s1.close();

        System.out.println("==============================");
        System.out.println("MENGGUNAKAN BINARY SEARCH");
        data.bubbleSortBuku();
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}