package Number26_50;

import java.util.Scanner;

public class Number43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }
        while (true){
            System.out.println("현재 좌석표:");
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr[i].length ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("예매할 좌석 행, 열 입력 (종료 -1)");
            int a = sc.nextInt();
            if (a == -1){
                break;
            }
            int b = sc.nextInt();
            if (arr[a][b] == 1){
                System.out.println("이미 예약되었습니다.");
                continue;
            }
            arr[a][b] = 1;
            System.out.println("예약이 되었습니다");
        }
    }
}
