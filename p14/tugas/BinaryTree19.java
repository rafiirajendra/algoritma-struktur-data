package p14.tugas;

public class BinaryTree19 {
    Node19 root;

    public BinaryTree19(){
        root = null;
    }


    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node19(data);
        } else {
            Node19 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node19(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node19(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    // Data already exists
                    break;
                }
            }
        }
    }

    boolean find (int data){
        Node19 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void taversePreOrder(Node19 node){
        if (node != null) {
            System.out.print(" " + node.data);
            taversePreOrder(node.left);
            taversePreOrder(node.right);
        }
    }

    void taversePostOrder(Node19 node) {
        if (node != null) {
            taversePostOrder(node.left);
            taversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void taverseInOrder(Node19 node){
        if (node != null) {
            taverseInOrder(node.left);
            System.out.print(" " + node.data);
            taverseInOrder(node.right);
        }
    }

    Node19 getSuccessor(Node19 del){
        Node19 successor = del.right;
        Node19 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete (int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node19 parent = root;
        Node19 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            //if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {//if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }                
            } else if (current.right == null) {//if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {//if there is 2 childs
                Node19 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    //Method menambahkan node dengan cara rekursif
    public Node19 addRecursive(Node19 current, int data) {
        if (current == null) {
            return new Node19(data);
        }
    
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // Data already exists
            return current;
        }
    
        return current;
    }
    
    //Menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMinRecursive(root);
    }
    
    public int findMinRecursive(Node19 current) {
        return current.left == null ? current.data : findMinRecursive(current.left);
    }
    
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMaxRecursive(root);
    }
    
    public int findMaxRecursive(Node19 current) {
        return current.right == null ? current.data : findMaxRecursive(current.right);
    }

    //Menampilkan data yang ada di leaf
    public void displayLeaves() {
        displayLeavesRecursive(root);
    }
    
    public void displayLeavesRecursive(Node19 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            displayLeavesRecursive(node.left);
            displayLeavesRecursive(node.right);
        }
    }

    //menampilkan berapa jumlah leaf yang ada di dalam tree
    public int countLeaves() {
        return countLeavesRecursive(root);
    }
    
    public int countLeavesRecursive(Node19 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
    }    
}