class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal: " + amount);
        }
    }
}

class AccountHolder implements Runnable {
     BankAccount account;
  boolean isDeposit;
     double amount;

    public AccountHolder(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class prob02 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Creating multiple threads for deposit and withdrawal
        Thread thread1 = new Thread(new AccountHolder(account, true, 500));
        Thread thread2 = new Thread(new AccountHolder(account, false, 300));
        Thread thread3 = new Thread(new AccountHolder(account, true, 700));
        Thread thread4 = new Thread(new AccountHolder(account, false, 200));

        // Starting all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
