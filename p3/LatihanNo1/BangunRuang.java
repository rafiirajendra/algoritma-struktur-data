import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahBangunRuang;
        System.out.print("Masukkan jumlah bangun ruang yang ingin dihitung: ");
        jumlahBangunRuang = scanner.nextInt();

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Bangun Ruang ke-" + (i + 1));

            System.out.print("Pilih jenis bangun ruang (1. Kerucut, 2. Limas 4 Sisi, 3. Bola): ");
            int jenisBangunRuang = scanner.nextInt();
            scanner.nextLine(); 

            switch (jenisBangunRuang) {
                case 1:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    int jariKerucut = scanner.nextInt();
                    System.out.print("Masukkan panjang sisi miring kerucut: ");
                    int siringKerucut = scanner.nextInt();

                    Kerucut kerucut = new Kerucut(jariKerucut, siringKerucut);

                    System.out.println("Luas Permukaan Kerucut: " + kerucut.luasPermukaanKerucut());
                    System.out.println("Volume Kerucut: " + kerucut.volumeKerucut());
                    
                    break;

                case 2:
                    System.out.print("Masukkan panjang sisi alas limas: ");
                    int sisiLimas = scanner.nextInt();
                    System.out.print("Masukkan tinggi limas: ");
                    int tinggiLimas = scanner.nextInt();

                    limas4sisi limas4sisi = new limas4sisi(sisiLimas, tinggiLimas);
                    

                    System.out.println("Luas Permukaan Limas 4 Sisi: " + limas4sisi.luasLimas(sisiLimas, tinggiLimas, tinggiLimas));
                    System.out.println("Volume Limas 4 Sisi: " + limas4sisi.volumeLimas());
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariBola = scanner.nextDouble();

                    Bola bola = new Bola(jariBola);
                    System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaanBola());
                    System.out.println("Volume Bola: " + bola.hitungVolumeBola());
                    break;

                default:
                    System.out.println("Jenis bangun ruang tidak valid.");
                    break;
            }
        }
    }
}
