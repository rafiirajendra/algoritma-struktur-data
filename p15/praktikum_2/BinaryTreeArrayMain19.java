package p15.praktikum_2;

public class BinaryTreeArrayMain19 {
    public static void main(String[] args) {
        BinaryTreeArray19 bta = new BinaryTreeArray19();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder traversal:");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}