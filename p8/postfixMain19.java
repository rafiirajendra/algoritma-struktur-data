package p8;

import java.util.Scanner;

public class postfixMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        postfix19 post = new postfix19(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
