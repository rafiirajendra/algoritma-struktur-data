package LatihanNo3;

public class mahasiswa {
    public String nama, jenisKelamin;
    public double ipk;
    public int nim;

    public static double rataIPK(mahasiswa[] informasi) {
        double sum = 0;
        for (mahasiswa mhs : informasi) {
            sum += mhs.ipk;
        }
        return sum / informasi.length;
    }

    public static mahasiswa tinggiIPK(mahasiswa[] informasi) {
        mahasiswa highest = informasi[0];
        for (int i = 1; i < informasi.length; i++) {
            if (informasi[i].ipk > highest.ipk) {
                highest = informasi[i];
            }
        }
        return highest;
    }
    
}
