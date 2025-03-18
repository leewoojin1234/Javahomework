import java.util.Scanner;

public class Number13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number; i < number+5; i++) {
            System.out.println(i);
        }
    }
}
