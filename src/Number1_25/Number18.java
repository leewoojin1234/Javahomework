package Number1_25;

public class Number18 {
    public static void main(String[] args) {
        for(int i = 0; ; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (i > 10) {
                break;
            }
            System.out.println(i);
        }
    }
}
