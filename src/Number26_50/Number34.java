package Number26_50;

import java.util.Scanner;

public class Number34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = 0;
        if (num1 < num2) {
            num3 = num2;
            num2 = num1;
            num1 = num3;
        }
        for (int i = num1; i >= num2; i--) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }
    }
}
