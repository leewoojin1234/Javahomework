package Number26_50;

import java.util.Scanner;

public class Number32 {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n == 0) break;
            sum += n;
        }
        System.out.println(sum);
    }
}
