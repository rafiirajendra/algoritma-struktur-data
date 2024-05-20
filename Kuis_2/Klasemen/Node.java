package Kuis_2.Klasemen;

class Node {
    public String tim;  
    public int poin;    
    public Node next;
    public Node prev;

    public Node(Node prev, String tim, int poin, Node next) {
        this.prev = prev;
        this.tim = tim;
        this.poin = poin;
        this.next = next;
    }
}
