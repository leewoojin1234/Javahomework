package Number1_25;

import java.util.Scanner;

public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = n; j >= m; j--) {
                System.out.printf("%d * %d = %d   ", j, i, i*j);
            }
            System.out.println();
        }
    }
}
