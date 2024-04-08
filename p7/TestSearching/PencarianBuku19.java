package p7.TestSearching;

public class PencarianBuku19 {
    Buku19 listBk[] = new Buku19[5];
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
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        } 
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul \t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t : " + listBk[pos].pengarang);
            System.out.println("Stock \t\t : " + listBk[pos].stock);
        } else {
            System.out.println("data  " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        bubbleSortBuku();
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listBk[mid].kodeBuku == cari) {
                return mid;
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void bubbleSortBuku() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (listBk[j].kodeBuku < listBk[j - 1].kodeBuku) {
                    Buku19 tmp = listBk[j];
                    listBk[j] = listBk[j - 1];
                    listBk[j - 1] = tmp;
                }
            }
        }
    }    
    public Buku19 FindBuku(int cari){
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j] != null && listBk[j].kodeBuku == cari) {
                return listBk[j];
            }
        }
        return null;
    }
}