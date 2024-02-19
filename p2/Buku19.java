package p2;
public class Buku19 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }
    
    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
        }
    }
    
    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal(int terjual){
        int total = harga * terjual;
        return total;

    }

    double hitungDiskon(int total){
        double diskon = 0;
        if (total > 150000) {
            diskon = total * 0.12;
        } else if (total > 75000) {
            diskon = total * 0.05;
        } 
        return diskon;

    }

    int hitungHargaBayar(int hargaDiskon, double hargaTotal){
        int tagihan =  (int)hargaTotal - hargaDiskon;
        return tagihan;
    }

    public Buku19(){
        
    }

    public Buku19(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}

