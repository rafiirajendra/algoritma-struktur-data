package p2;
public class BukuMain19 {
    public static void main(String[] args) {
        Buku19 bk1 = new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        int totalHarga = bk1.hitungHargaTotal(8);
        System.out.println("Toal Harga: "+ totalHarga);
        double diskon = bk1.hitungDiskon(totalHarga);
        System.out.println("Diskon: "+ diskon);
        int hargaBayar = bk1.hitungHargaBayar(totalHarga,(int) diskon);
        System.out.println("Bayar: "+ hargaBayar);

        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        
        Buku19 bukuRafi = new Buku19("Laskar Pelangi", "Andrea Hinata", 534, 19, 290000);
        bukuRafi.terjual(9);
        bukuRafi.tampilInformasi();
    }
}
