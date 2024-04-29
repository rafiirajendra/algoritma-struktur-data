package p6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();

        Hotel H1 = new Hotel("Hotel 1", "Jakarta", 100000, (byte) 5);
        Hotel H2 = new Hotel("Hotel 2", "Bandung", 700000, (byte) 4);
        Hotel H3 = new Hotel("Hotel 3", "Surabaya", 400000, (byte) 3);
        Hotel H4 = new Hotel("Hotel 4", "Malang", 200000, (byte) 2);
        Hotel H5 = new Hotel("Hotel 5", "Blitar", 500000, (byte) 1);
        
        list.tambah(H1);
        list.tambah(H2);
        list.tambah(H3);
        list.tambah(H4);
        list.tambah(H5);

        System.out.println("List Harga Hotel:");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("\nRating Hotel:");
        list.selectionSort();
        list.tampilAll();
    }
}
