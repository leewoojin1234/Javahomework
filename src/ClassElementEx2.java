class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return amount;
    }
    public int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        balance -= amount;
        return amount;
    }

    public void printBalance() {
        System.out.println("잔고: "+balance);
    }
}

public class ClassElementEx2 {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        account.printBalance();
    }
}
