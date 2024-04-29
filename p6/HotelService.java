package p6;

public class HotelService {
    Hotel[] rooms = new Hotel[6];
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
        for (int i = 0; i < idx; i++) { 
            if (rooms[i] != null) { 
                rooms[i].tampil();
                System.out.println("------------------------------");
            }
        }
    }

    void bubbleSort(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j] != null && rooms[j + 1] != null && rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (rooms[j].bintang > rooms[maxIdx].bintang) { 
                    maxIdx = j;
                }
            }
            Hotel temp = rooms[maxIdx];
            rooms[maxIdx] = rooms[i];
            rooms[i] = temp;
        }
    }
}
