import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = input.next().charAt(0);

        int index = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            char[] listKota = kota[index];
            String namaKota = new String(listKota);
            System.out.println("Kota " + namaKota);
        } else {
            System.out.println("Kode plat tidak valid!");
        }
    }
}
