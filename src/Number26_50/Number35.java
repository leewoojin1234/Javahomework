package Number26_50;

import java.util.Scanner;

public class Number35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int a = sc.nextInt();
            if (a == 1) {
                int sum = 0;
                System.out.println("상품명을 입력하세요: ");
                String s = sc.next();
                System.out.println("상품의 가격을 입력하세요: ");
                int b = sc.nextInt();
                System.out.println("구매 수량을 입력해주세요: ");
                int c = sc.nextInt();
                sum = sum + b * c;
                total = total + b * c;
                System.out.printf("상품명 : %s 가격 : %d 수량 %d 합계 %d", s, b, c, sum);
                System.out.println();
            }
            if (a == 2) {
                System.out.printf("총비용 : %d", total);
                System.out.println();

            }
            if (a == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
