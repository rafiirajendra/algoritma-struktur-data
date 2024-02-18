import java.util.Scanner;

public class fungsi {

    public static void main(String[] args) {

        String[] toko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] harga = {75000, 50000, 60000, 10000};

        int[][] stockBunga = {
                {10, 5, 15, 7},  // RoyalGarden 1
                {6, 11, 9, 12},  // RoyalGarden 2
                {2, 10, 10, 5},  // RoyalGarden 3
                {5, 7, 12, 9}    // RoyalGarden 4
        };

        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("=============");
            System.out.println("ROYAL GARDEN");
            System.out.println("=============");
            System.out.println("1. Pendapatan Setiap Cabang");
            System.out.println("2. Cek Stock Setiap Cabang");
            System.out.println("3. Keluar Menu");
            System.out.print("Pilih 1/2/3: ");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("=================");
                    System.out.println("Pendapatan Cabang");
                    System.out.println("=================");
                    for (int i = 0; i < toko.length; i++) {
                        System.out.println((i + 1) + ". " + toko[i]);
                    }
                    System.out.print("Pilih cabang: ");
                    int selectedBranch = scanner.nextInt();
                    if (selectedBranch >= 1 && selectedBranch <= toko.length) {
                        System.out.println("=====================");
                        System.out.println("Pendapatan " + toko[selectedBranch - 1] + ": " + hitungPendapatanCabang(selectedBranch - 1, bunga, harga, stockBunga));
                        System.out.println("=====================");
                    } else {
                        System.out.println("Cabang tidak valid.");
                    }
                    break;
                    case 2:
                    System.out.println("=================");
                    System.out.println("Cek Stock Cabang");
                    System.out.println("=================");
                    for (int i = 0; i < toko.length; i++) {
                        System.out.println((i + 1) + ". " + toko[i]);
                    }
                    System.out.print("Pilih Cabang: ");
                    int selectedBranchStock = scanner.nextInt();
                    if (selectedBranchStock >= 1 && selectedBranchStock <= toko.length) {
                        System.out.println("=====================");
                        System.out.println("Stock " + toko[selectedBranchStock - 1] + ":");
                        if (selectedBranchStock == 4) {
                            stockBunga[selectedBranchStock - 1][0] -= 1;  // Aglonema
                            stockBunga[selectedBranchStock - 1][1] -= 2;  // Keladi
                            stockBunga[selectedBranchStock - 1][3] -= 5;  // Mawar
                        }
                        cekStockCabang(selectedBranchStock - 1, bunga, stockBunga);
                        System.out.println("=====================");
                    } else {
                        System.out.println("Cabang tidak valid.");
                    }
                    break;
                default:
                    break;
            }
        } while (menu != 3);
    }

    public static void cekStockCabang(int branchIndex, String[] bunga, int[][] stockBunga) {
        System.out.println("Bunga\t\tStock");
        for (int j = 0; j < bunga.length; j++) {
            System.out.printf("%-10s\t%d\n", bunga[j], stockBunga[branchIndex][j]);
        }
    }

    public static int hitungPendapatanCabang(int branchIndex, String[] bunga, int[] harga, int[][] stockBunga) {
        int totalPendapatan = 0;
        for (int j = 0; j < bunga.length; j++) {
            totalPendapatan += stockBunga[branchIndex][j] * harga[j];
        }
        return totalPendapatan;
    }
}
