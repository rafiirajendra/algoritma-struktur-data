package uts;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        int[] angka = {0, 28, 26, 32, 36, 48, 10, 19, 12, 15, 19, 2, 12, 12, 11, 24, 46};

        System.out.println("=== Data Sebelum di urutkan ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("  " + angka[i]);
        }

        insertionSort(angka);
        System.out.println("\n== Data Setelah di urutkan dengan insertion sort ==");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("  " + angka[i]);
        }
        System.out.print("\nMasukkan angka yang ingin dicari: ");
        Scanner input = new Scanner(System.in);
        int angkaCari = input.nextInt();
        
        System.out.println("Hasil pencarian dengan binary search: ");

        int posisi = findBinarySearch(angka, angkaCari);
        if (posisi != -1) {
            System.out.println("Angka " + angkaCari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("Angka " + angkaCari + " tidak ditemukan");
        }

        input.close();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static int findBinarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}