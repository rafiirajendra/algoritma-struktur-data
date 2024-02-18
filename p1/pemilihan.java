import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas: ");
        float tugas = input.nextFloat();
        
        System.out.print("Masukkan nilai kuis: ");
        float kuis = input.nextFloat();
        
        System.out.print("Masukkan nilai UTS: ");
        float uts = input.nextFloat();
        
        System.out.print("Masukkan nilai UAS: ");
        float uas = input.nextFloat();

        input.close();

        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
        } else {
            float total = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.3F);
            if(total>80&&total<=100){
                System.out.println("Nilai akhir= " +total);
                System.out.println("Nilai huruf = A");
            }else if (total>73&&total>= 80){
                System.out.println("Nilai akhir " +total);
                System.out.println("Nilai huruf = B");
            }else if (total>60&&total>=73){
                System.out.println("Nilai akhir " +total);
                System.out.println("Nilai huruf = B+");
            }else if (total>60&&total>= 65){
                System.out.println("Nilai akhir " +total);
                System.out.println("Nilai Huruf = C+");
            }else if (total>50&&total>= 60){
                System.out.println("Nilai akhir " +total);
                System.out.println("Nilai Huruf = C");
            }else if (total>39&&total>= 50){
                System.out.println("Nilai akhir " +total);
                System.out.println("Nilai huruf = D");
            }else if (total<=39){
                System.out.println("Nilai akhir " +total);
                System.out.println("Nilai huruf = E");
            }
            if (total >= 50) {
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA LULUS");
                System.out.println("==============================");
            } else {
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("ANDA TIDAK LULUS");
            }
            System.out.println("==============================");
        }
    }
}
