package Number26_50;

public class Number46 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }
}
