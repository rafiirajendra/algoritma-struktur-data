public class Kerucut {
    public int jari;
    public int siring;

    public Kerucut(int jk, int srk){
        jari = jk;
        siring = srk;
    }

    public double luasPermukaanKerucut(){
        return (22/7 * jari * siring) + (22/7 * jari * jari);
    }

    public double volumeKerucut(){
        return 22/7 * jari * jari * 10 /3 ;
    }
}