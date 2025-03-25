package Number26_50;

import java.util.Scanner;

public class Number44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[10][2];
        int cnt = 0;
        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            switch (sc.nextInt()){
                case 1:
                    if (cnt < 10){
                        System.out.print("상품 이름을 입력하세요: ");
                        String name = sc.next();
                        System.out.print("상품 가격을 입력하세요: ");
                        String price = sc.next();
                        arr[cnt][0] = name;
                        arr[cnt][1] = price;
                        cnt++;
                        break;
                    }
                    else {
                        System.out.println("상품은 최대 10개까지 등록할 수 있습니다.");
                        break;
                    }
                case 2:
                    if (cnt == 10){
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    else {
                        System.out.println("상품 목록:");
                        for (int i = 0; i < cnt; i++){
                            System.out.println(i+1+". 상품 이름: "+arr[i][0]+", 가격: " + arr[i][1]);
                        }
                        break;
                    }
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 숫자를 입력하셨습니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
