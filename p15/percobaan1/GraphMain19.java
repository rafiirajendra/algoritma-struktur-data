package p15.percobaan1;

import java.util.Scanner;

public class GraphMain19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Graph19 gedung = new Graph19(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        while (true) {
            System.out.print("Masukkan gedung asal: ");
            int asal = scanner.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = scanner.nextInt();

            if (gedung.isPath(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
            }

            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            }
        }

        scanner.close();
    }
}