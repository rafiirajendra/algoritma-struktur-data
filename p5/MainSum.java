package p5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        Sum[] companies = new Sum[numCompanies];

        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan Jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int numMonths = sc.nextInt();
            companies[i] = new Sum(numMonths);
            System.out.println("-----------------------------------------------------------");
            System.out.println("Untuk Perusahaan ke-" + (i + 1) + ":");
            for (int j = 0; j < numMonths; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + ": ");
                double profit = sc.nextDouble();
                companies[i].setKeuntungan(j, profit);
            }
            System.out.println("-----------------------------------------------------------");
        }

        System.out.println("============================================================");
        System.out.println("Total Keuntungan untuk Setiap Perusahaan");
        System.out.println("============================================================");

        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Perusahaan ke-" + (i + 1) + ":");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + companies[i].getElemen() + " bulan adalah = " + companies[i].totalBF());
            System.out.println("Algoritma Devide Conquer");
            System.out.println("Total keuntungan perushaan selama " + companies[i].getElemen() + " bulan adalah = " + companies[i].totalDC());
            System.out.println("============================================================");
        }
    }
}
