public class limas4sisi {
    public double sisi;
    public double tinggi;

    public double luasLimas(double sisiAlas, double tinggiLimas, double tinggiSisi){
        double luasAlas = sisiAlas * sisiAlas;
        double luasSelimut = 4 * sisiAlas * tinggiSisi /2;
        double luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }

    public limas4sisi(double sisiLimas, double tinggiLimas){
        sisi = sisiLimas;
        tinggi = tinggiLimas;
    }

    public double volumeLimas(){
        return (sisi * sisi) * tinggi /3;
    }
}