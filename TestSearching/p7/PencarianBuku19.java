package p7;

public class PencarianBuku19 {
    Buku19 listBk[] = new Buku19[2];
    int idx;

    void tambah(Buku19 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(Buku19 m : listBk){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = 0;
        for (int j = 0; j < listBk.length; j++) {
            j = posisi;
            break;
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
}