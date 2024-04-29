package p5;

public class Mobil {
    String[] merk = {"BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen"};
    String[] tipe = {"M2 Copue", "Fiesta ST", "370Z", "BRZ", "Impreza WRX STI", "AE86 Trueno", "86/GT86", "Golf GTI"};
    int[] tahun = {2016, 2014, 2009, 2014, 2013, 1986, 2014, 2014};
    int[] top_acceleration = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
    int[] top_power = {728, 575, 657, 609, 703, 553, 609, 631};

    int cariMax(int[] arr, int kiri, int kanan){
        if (kiri == kanan) {
            return arr[kiri];
        }
        
        int mid = kiri + (kanan - kiri) / 2;
        int maxKiri = cariMax(arr, kiri, mid);
        int maxKanan = cariMax(arr, mid + 1, kanan);

        return Math.max(maxKiri, maxKanan);
    }

    int cariMin(int[] arr, int kiri, int kanan){
        if (kiri == kanan) {
            return arr[kiri];
        }
        int mid = kiri + (kanan - kiri) / 2;
        int minKiri = cariMin(arr, kiri, mid);
        int minKanan = cariMin(arr, mid + 1, kanan);

        return Math.min(minKiri, minKanan);
    }

    double power(int[] arr){
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}
