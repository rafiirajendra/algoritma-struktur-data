import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih rumus yang ingin dihitung:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("1/2/3: ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan (v): " + kecepatan);
    }

    private static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak (s): " + jarak);
    }

    private static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu (t): " + waktu);
    }
}
