package Number26_50;

public class Number49 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = sum(a, b, c);
        double avg = avg(sum);
        System.out.println("평균값: "+ avg);
        int x = 15;
        int y = 25;
        int z = 35;
        int sum1 = sum(x,y,z);
        double avg1 = avg(sum1);
        System.out.println("평균값: " + avg1);
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static double avg(double sum) {
        return sum / 3;
    }
}
