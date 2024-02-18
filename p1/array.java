import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] matkul = {"Pancasila", "KTI", "CTPS", "MatDas", "BING", "DasPro", "PrakDasPro", "K3"};
        int[] bobotsks = {2, 2, 2, 3, 2, 2, 3, 2};

        double[] nilaiMatkul = new double[matkul.length];

        System.out.println("=====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai untuk matkul " + matkul[i] + ": ");
            
            while (!scanner.hasNextDouble()) {
                System.out.println("Masukkan nilai yang benar.");
                scanner.next();
                System.out.print("Masukkan nilai untuk matkul " + matkul[i] + ": ");
            }

            nilaiMatkul[i] = scanner.nextDouble();
        }

        double totalSKS = 18;
        double totalNilaiBobot = 0;

        String[] nilaiHuruf = new String[matkul.length];
        double[] bobot = new double[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4;
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3;
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobot[i]= 2.5;
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2;
            } else if (nilaiMatkul[i] >= 39 && nilaiMatkul[i] <= 50) {
                nilaiHuruf[i] = "E";
                bobot[i] = 0;
            } else if (nilaiMatkul[i] >= 39) {
                nilaiHuruf[i] = "E";
                bobot[i] = 0;
            }
        }

        for (int i = 0; i < bobot.length; i++) {
            totalNilaiBobot += bobot[i] * bobotsks[i];
        }

        double IP = totalNilaiBobot / totalSKS;

        System.out.println("========================");
        System.out.println("Hasil Konversi Nilai:");
        System.out.println("========================");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-15s %-15s %-15s %-15s\n", matkul[i], nilaiMatkul[i], nilaiHuruf[i], bobot[i]);
        }

        System.out.println("========================");
        System.out.printf("IP: %.2f\n", IP);

        scanner.close();
    }
}
