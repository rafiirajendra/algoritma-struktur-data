package LatihanNo2;
import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        mahasiswa[] informasi = new mahasiswa[3];

        for (int i = 0; i < informasi.length; i++) {
            informasi[i] = new mahasiswa();
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama: ");
            informasi[i].nama = input.nextLine();

            System.out.print("Masukkan nim: ");
            informasi[i].nim = input2.nextInt();

            System.out.print("Masukkan jenis kelamin (L/P): ");
            String jenisKelaminInput;
            do {
                jenisKelaminInput = input.nextLine().toUpperCase();
                if (!(jenisKelaminInput.equals("L") || jenisKelaminInput.equals("P"))) {
                    System.out.println("Input salah. Silakan masukkan 'L' untuk Laki-laki atau 'P' untuk Perempuan.");
                }
            } while (!(jenisKelaminInput.equals("L") || jenisKelaminInput.equals("P")));
            informasi[i].jenisKelamin = jenisKelaminInput;
            
            System.out.print("Masukkan IPK: ");
            informasi[i].ipk = input3.nextInt();
        }
        input.close();
        input2.close();
        input3.close();

        System.out.println("=======================================================");
        for (int i = 0; i < informasi.length; i++) {
            System.out.println("Data Mahasiswa ke- " + (i+1));
            System.out.println("Nama: " + informasi[i].nama);
            System.out.println("nim: " + informasi[i].nim);
            System.out.println("Jenis Kelamin: " + informasi[i].jenisKelamin);
            System.out.println("Nilai IPK: " + informasi[i].ipk);
        }
        System.out.println("=======================================================");
    }
}
