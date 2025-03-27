package Number51_75;

public class Number52 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " +  balance+"원");
    }
    public static int deposit(int a, int b) {
        a += b;
        System.out.println(b+"원을 입금하였습니다. 현재 잔액: "+ a+"원");
        return a;
    }
    public static int withdraw(int a, int b) {
        if (a < b) {
            System.out.println("출금하려했으나 잔액이 부족합니다.");
        }
        a -= b;
        System.out.println(b+"원을 출금하였습니다. 현재 잔액: "+ a+"원");
        return a;
    }
}
