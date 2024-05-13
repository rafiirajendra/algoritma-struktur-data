package p13;

public class MainDoubleLinkedLists {
    public static void main(String[] args) throws Exception {
        // // Percobaan 1
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());

        // Percobaan 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());

        // Percobaan 3
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        System.out.println("Data awal pada linked Lists diatas adalah : " + dll.getFirst());
        System.out.println("Data akhir pada linked Lists diatas adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada linked Lists diatas adalah : " + dll.get(1));
    }
}
