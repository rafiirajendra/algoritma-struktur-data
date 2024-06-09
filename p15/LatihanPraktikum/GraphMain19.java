package p15.LatihanPraktikum;

import java.util.Scanner;

public class GraphMain19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Graph19 gedung = new Graph19(6);

        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("a) Tambah Edge");
            System.out.println("b) Hapus Edge");
            System.out.println("c) Degree");
            System.out.println("d) Cetak Graph");
            System.out.println("e) Cek Edge");
            System.out.println("f) Update Jarak");
            System.out.println("g) Keluar");
            System.out.print("Pilih opsi: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.print("Masukkan asal, tujuan, dan jarak (misal: 0 1 50): ");
                    int asal = scanner.nextInt();
                    int tujuan = scanner.nextInt();
                    int jarak = scanner.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 'b':
                    System.out.print("Masukkan asal dan tujuan untuk menghapus edge (misal: 1 3): ");
                    asal = scanner.nextInt();
                    tujuan = scanner.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 'c':
                    System.out.print("Masukkan vertex untuk mencari degree (misal: 0): ");
                    asal = scanner.nextInt();
                    gedung.degree(asal);
                    break;
                case 'd':
                    gedung.printGraph();
                    break;
                case 'e':
                    System.out.print("Masukkan asal dan tujuan untuk mengecek edge (misal: 0 1): ");
                    asal = scanner.nextInt();
                    tujuan = scanner.nextInt();
                    boolean exists = gedung.checkEdge(asal, tujuan);
                    System.out.println("Edge ada: " + exists);
                    break;
                case 'f':
                    System.out.print("Masukkan asal, tujuan, dan jarak baru (misal: 0 1 75): ");
                    asal = scanner.nextInt();
                    tujuan = scanner.nextInt();
                    jarak = scanner.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;
                case 'g':
                    running = false;
                    break;
                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
