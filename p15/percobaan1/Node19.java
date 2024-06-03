package p15.percobaan1;
public class Node19 {
    int data;
    Node19 prev, next;
    int jarak;

    Node19(Node19 prev, int data, int jarak, Node19 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}