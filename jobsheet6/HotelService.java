package jobsheet6;

public class HotelService {
    Hotel[] rooms = new Hotel[5];
    int idx;

    void tambah (Hotel H){
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll (){
        for(Hotel H : rooms){
            H.tampil();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 1; j < rooms.length-1; j++) {
                if (rooms[j].harga > rooms[j-1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 1; i < rooms.length; i++) {
            Hotel tmp = rooms[i];
            int j = i;
            while (j > 0 && rooms[j-1].bintang < tmp.bintang) { // ubah operator '>' menjadi '<'
                rooms[j] = rooms[j-1];
                j--;
            }
            rooms[j] = tmp;
        }
    }
}
