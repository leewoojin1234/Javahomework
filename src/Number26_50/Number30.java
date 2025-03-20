package Number26_50;

import java.util.Scanner;

public class Number30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요.");
        int number = sc.nextInt();
        System.out.println();
        if (number % 2 == 0) {
            System.out.printf("입력한 숫자 %d는 짝수입니다.", number);
        }
        else {
            System.out.printf("입력한 숫자 %d는 홀수입니다.", number);
        }
    }

}
