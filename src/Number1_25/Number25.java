package Number1_25;

public class Number25 {
    public static void main(String[] args) {
        char a='A';
        int n=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(a+" ");
                a++;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
