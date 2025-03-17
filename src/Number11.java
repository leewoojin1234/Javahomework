import java.util.Scanner;

public class Number11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        for (int i = 0; i < n; i++) {
            int num = start;
            for (int j = 0; j < n; j++) {
                System.out.print(num + " ");
                num += 2;
                if (num > 9) num = 1;
            }
            System.out.println();
            start = num;
        }
    }
}
