import java.util.Scanner;

public class Number15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            if (number % 2 == 1) {
                number++;
            }
            System.out.print(number+" ");
            number+=2;
        }
    }
}
