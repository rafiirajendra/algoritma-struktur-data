public class Segitiga {
    public static String hitungLuas;
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){

    }

    public int hitungLuas(){
        return alas * tinggi /2;
    }

    public int hitungKeliling(){
        return alas + tinggi + Math.hypot(tinggi, alas);
    }
}



