public class Segitiga {
    public static String hitungLuas;
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
        this.alas = a;
        this.tinggi = t;
    }

    public int hitungLuas(){
        return alas * tinggi /2;
    }

    public double hitungKeliling(){
        return alas + tinggi + Math.hypot(tinggi, alas);
    }
}