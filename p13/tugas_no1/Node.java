package p13.tugas_no1;
public class Node {
    String data;
    Node next;
    Node prev;
    
    Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}