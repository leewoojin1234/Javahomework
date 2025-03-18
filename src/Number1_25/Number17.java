package Number1_25;

import java.util.Scanner;

public class Number17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int cnt = 0;
        while (cnt < number) {
            cnt++;
            sum += cnt;
            System.out.print(sum+" ");
        }
    }
}
