import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("점수를 입력하세요");
            number = sc.nextInt();
            if (number > 100) {
                break;
            }
            else if (number < 80) {
                System.out.println("죄송합니다. 불합격입니다.");
            }
            else {
                System.out.println("축하합니다. 합격입니다.");
            }
        }
    }
}
