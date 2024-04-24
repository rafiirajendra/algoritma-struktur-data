package p8;

import java.util.Scanner;

public class gudang19 {
    barang19[] tumpukan;
    int size, top;

    public gudang19(int kapasitas){
        size = kapasitas;
        tumpukan = new barang19[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    } 

    boolean cekPenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambangBarang(barang19 barang){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = barang;
            System.out.println("Barang " + barang.nama + " berhasil di tambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public barang19 ambilBarang(){
        if (!cekKosong()) {
            barang19 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalkeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

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

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang.");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n" , tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalkeBiner(int kode){
        StackKonversi19 stack = new StackKonversi19();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public barang19 lihatBarangTerbawah(){
        if (!cekKosong()) {
            barang19 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    
    public void cariBarang(Scanner scanner) {
        System.out.println("Pilih metode pencarian:");
        System.out.println("1. Berdasarkan kode barang");
        System.out.println("2. Berdasarkan nama barang");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan kode barang: ");
                int kodeCari = scanner.nextInt();
                scanner.nextLine();
                boolean ditemukanKode = false;
                for (int i = 0; i <= top; i++) {
                    if (tumpukan[i].kode == kodeCari) {
                        System.out.println("Barang ditemukan: " + tumpukan[i].nama + " (Kode: " + tumpukan[i].kode + ")");
                        ditemukanKode = true;
                        break;
                    }
                }
                if (!ditemukanKode) {
                    System.out.println("Barang dengan kode " + kodeCari + " tidak ditemukan.");
                }
                break;
            case 2:
                System.out.print("Masukkan nama barang: ");
                String namaCari = scanner.nextLine();
                boolean ditemukanNama = false;
                for (int i = 0; i <= top; i++) {
                    if (tumpukan[i].nama.equalsIgnoreCase(namaCari)) {
                        System.out.println("Barang ditemukan: " + tumpukan[i].nama + " (Kode: " + tumpukan[i].kode + ")");
                        ditemukanNama = true;
                        break;
                    }
                }
                if (!ditemukanNama) {
                    System.out.println("Barang dengan nama " + namaCari + " tidak ditemukan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
