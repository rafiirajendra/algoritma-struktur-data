package p8;
import java.util.Scanner;

public class utama19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gudang19 gudang = new gudang19(7);

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
    }
}
