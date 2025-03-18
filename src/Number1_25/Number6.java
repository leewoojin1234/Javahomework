package Number1_25;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("sum : "+sum);
        System.out.printf("avg : %.1f", sum / 3.0);
    }
}
