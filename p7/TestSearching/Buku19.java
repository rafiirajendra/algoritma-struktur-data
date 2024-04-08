package p7;

public class Buku19 {
    static Buku19[] listBuku = new Buku19[5]; 
    static int jumlahBuku = 0;
    int kodeBuku, tahunTerbit, stock;
    String judulBuku, pengarang;

    public Buku19(int kodeBuku, int tahunTerbit, int stock, String judulBuku, String pengarang) {
        this.judulBuku = judulBuku;
        this.kodeBuku = kodeBuku;
        this.tahunTerbit = tahunTerbit;
        this.stock = stock;
        this.pengarang = pengarang;
        Buku19.listBuku[jumlahBuku] = this; 
        jumlahBuku++;
    }

    void tampilDataBuku() {
        System.out.println("===========================");
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }
}