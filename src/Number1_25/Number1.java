package Number1_25;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.삽입");
        System.out.println("2.수정");
        System.out.println("3.삭제");
        System.out.println("숫자를 선택하세요.");
        int number = input.nextInt();
        manual(number);
    }
    static void manual(int num){
        switch(num){
            case 1:
                System.out.println("삽입을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("수정을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("삭제를 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못된 숫자를 선택하셨습니다.");
                break;
        }
    }
}
