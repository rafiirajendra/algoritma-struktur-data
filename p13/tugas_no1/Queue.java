package p13.tugas_no1;

class Queue {
    Node front, rear;

    Queue() {
        this.front = this.rear = null;
    }

    void enqueue(String data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        System.out.println(data + " telah ditambahkan ke dalam antrian.");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong, tidak ada yang dapat dihapus.");
            return;
        }
        System.out.println(front.data + " telah selesai divaksinasi.");
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }
    }

    void print() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node temp = front;
        int noAntrian = 1;
        System.out.println("| No Antrian | Nama          |");
        System.out.println("|------------|---------------|");
        while (temp != null) {
            System.out.printf("| %-10d | %-13s |\n", noAntrian++, temp.data);
            temp = temp.next;
        }
        System.out.println("Tersisa " + (noAntrian - 1) + " antrian.");
    }

    boolean isEmpty() {
        return front == null;
    }
}