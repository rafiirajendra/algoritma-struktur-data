package p5;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat(12, 3);
            System.out.println("Masukkan nilai yang tidak dipangkatkan: ");
            int nilai = sc.nextInt();
            png[i].nilai = nilai;
            System.out.println("Masukkan nilai pemangkat");
            int pangkat = sc.nextInt();
            png[i].pangkat = pangkat;
        }

        System.out.println("============================");
        System.out.println("Pilih Metode");
        System.out.println("1. Brute Force");
        System.out.println("Divide and Conquer");

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println(
                            "Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF()
                    );
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println(
                            "Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                    );
                }
                break;
            default:
                break;
        }
        sc.close();
    }

}
