package p5;

public class MainMobil {
    public static void main(String[] args) {
        Mobil output = new Mobil();

        System.out.println("=======================================");
        System.out.println("Mobil dengan top_acceleration tertinggi: " + output.cariMax(output.top_acceleration, 0, output.top_acceleration.length - 1));
        System.out.println("=======================================");
        System.out.println("Mobil dengan top_acceleration terendah: " + output.cariMin(output.top_acceleration, 0, output.top_acceleration.length - 1));
        System.out.println("=======================================");
        System.out.println("Rata-rata top_speed dari seluruh mobil: " + output.power(output.top_power));
    }
}
