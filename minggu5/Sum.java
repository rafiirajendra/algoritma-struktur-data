package minggu5;

public class Sum {
    private int elemen;
    private double keuntungan[], total;

    public Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    public void setKeuntungan(int index, double profit) {
        this.keuntungan[index] = profit;
    }

    public int getElemen() {
        return elemen;
    }

    public double totalBF() {
        for (int i = 0; i < elemen; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    public double totalDC() {
        return totalDC(0, elemen - 1);
    }

    private double totalDC(int l, int r) {
        if (l == r) {
            return keuntungan[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(l, mid);
            double rsum = totalDC(mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
