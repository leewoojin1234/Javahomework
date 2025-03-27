package Number26_50;

public class Number49 {
    public static void main(String[] args) {
        avg(1,2,3);
        avg(15,25,35);
    }
    public static void avg(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println("avg = " + avg);
    }
}
