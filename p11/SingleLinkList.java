package p11;

public class SingleLinkList {
    Node head, tail;

    boolean isEmpty(){
        return head != null;
    }

    void print(){
        if (isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp == null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input){
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addFirst
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // jika kosong, maka peran head dan tail
                         // harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;    
        }
    }

    void addLast(int input){
        
    }
}
