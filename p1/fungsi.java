import java.util.Scanner;

public class fungsi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] harga = {75000, 50000, 60000, 10000};

        int[][] stockBunga = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 11, 9, 12},  // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        };

        System.out.println("Pilih operasi:");
        System.out.println("1. Menampilkan pendapatan setiap cabang");
        System.out.println("2. Menampilkan stock bunga setiap toko");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                tampilkanPendapatanCabang(bunga, harga, stockBunga);
                break;
            case 2:
                tampilkanStockToko(stockBunga, bunga);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan masukkan 1 atau 2.");
                break;
        }
    }

    public static void tampilkanPendapatanCabang(String[] bunga, int[] harga, int[][] stockBunga) {
        for (int i = 0; i < stockBunga.length; i++) {
            long totalPendapatanCabang = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatanCabang += stockBunga[i][j] * harga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp" + totalPendapatanCabang);
        }
    }

    public static void tampilkanStockToko(int[][] stockBunga, String[] bunga) {
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.println("Stock di RoyalGarden " + (i + 1) + ":");
            for (int j = 0; j < stockBunga[i].length; j++) {
                System.out.println(bunga[j] + ": " + stockBunga[i][j]);
            }
        }
    }
}
