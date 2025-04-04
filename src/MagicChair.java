import java.util.Scanner;

public class MagicChair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 입력
        int[] arr = new int[5];
        System.out.print("마법의 의자에 앉을 친구들의 번호를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 회전 횟수 입력
        System.out.print("마법을 몇 번 사용할까요? ");
        int k = scanner.nextInt();

        // 배열 회전
        rotateRight(arr, k);

        // 결과 출력 (지정된 형식 적용)
        System.out.print("마법이 발동되었습니다! 새로운 자리 배치는: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // 줄 바꿈
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k %= n; // 배열 크기를 초과하는 회전 방지

        reverse(arr, 0, n - 1); // arr를 전체룰 뒤집음
        reverse(arr, 0, k - 1); // 입력된 수 만큼 앞에서 부터 뒤집음
        reverse(arr, k, n - 1); // 입력된 수 부터 끝까지 뒤집음
    }

    private static void reverse(int[] arr, int start, int end) {
        // start가 end보다 작을 때까지만 반복 (중앙에서 만나면 종료)
        while (start < end) {
            // 배열의 start 인덱스 값과 end 인덱스 값을 서로 교환
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // start는 오른쪽으로, end는 왼쪽으로 이동 (양쪽에서 중앙으로 접근)
            start++;
            end--;
        }
    }
}
