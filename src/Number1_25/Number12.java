package Number1_25;

import java.util.Scanner;

public class Number12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while (count < 5) {
            count++;
            System.out.println(number++);
        }
    }
}
