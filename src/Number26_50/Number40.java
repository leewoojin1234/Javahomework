package Number26_50;
import java.util.Scanner;

public class Number40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n = sc.nextInt();
        arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println((float)sum/arr.length);
    }
}
