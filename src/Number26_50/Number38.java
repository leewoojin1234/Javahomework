package Number26_50;
import java.util.Scanner;

public class Number38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            }
            else {
                System.out.print(arr[i]);
            }
        }
    }
}
