package p5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("-------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("masukkan nilai data ke-" + (i+1) + ":");
            fk[i].nilai = sc.nextInt();
        }

        sc.close();

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide And Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
