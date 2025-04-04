import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 입력
        int[] arr = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 회전 횟수 입력
        System.out.print("회전 횟수를 입력하세요: ");
        int k = scanner.nextInt();
        scanner.close();

        // 회전 처리
        for (int i = 0; i < k; i++) {
            rotateOnce(arr);
        }

        // 결과 출력
        System.out.println("회전 후 배열: " + Arrays.toString(arr));
    }

    // 배열을 한 칸씩 오른쪽으로 이동하는 함수 (비효율적인 방법)
    public static void rotateOnce(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
