package Number1_25;

import java.util.Scanner;

public class Number10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = n-2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i+1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
