package Kuis_2.Klasemen;

public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void addFirst(String tim, int points) {
        Node newNode = new Node(null, tim, points, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(String tim, int points) {
        Node newNode = new Node(null, tim, points, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }

        size++;
    }

    public void remove(String tim) {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        Node current = head;
        while (current != null && !current.tim.equals(tim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Tim " + tim + " tidak ditemukan dalam list");
            return;
        }

        if (current.prev == null) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }

        size--;
        System.out.println("Tim " + tim + " berhasil dihapus dari list");
    }

    public boolean search(String tim) {
        Node current = head;
        while (current != null) {
            if (current.tim.equals(tim)) {
                System.out.println("Tim " + tim);
                System.out.println("Dengan poin " + current.poin);
                return true;
            }
            current = current.next;
        }

        System.out.println("Tim " + tim + " tidak ada dalam list");
        return false;
    }

    public void print() {
        if (!isEmpty()) {
            boolean wasChanged;
            do {
                Node current = head;
                Node previous = null;
                Node next = head.next;
                wasChanged = false;
    
                while (next != null) {
                    if (current.poin < next.poin) {
                        if (previous != null) {
                            Node sig = next.next;
                            previous.next = next;
                            next.next = current;
                            current.next = sig;
                        } else {
                            Node sig = next.next;
                            head = next;
                            next.next = current;
                            current.next = sig;
                        }
                        previous = next;
                        next = current.next;
                        wasChanged = true;
                    } else {
                        previous = current;
                        current = next;
                        next = next.next;
                    }
                }
            } while (wasChanged);

            Node tmp = head;
            System.out.println("---------------------------------------");
            System.out.println("|   No   |    Nama Tim       | Poin  |");
            System.out.println("---------------------------------------");
            int index = 1;
            while (tmp != null) {
                System.out.println("|  " + String.format("%4d", index++) + "  | " + String.format("%-17s", tmp.tim) + " | " + String.format("%5d", tmp.poin) + " |");
                tmp = tmp.next;
            }
            System.out.println("---------------------------------------");
        } else {
            System.out.println("Tidak ada tim yang ditampilkan");
        }
    }
    
}

