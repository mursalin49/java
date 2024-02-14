package lab_mid;

class Account{
    int id;
   String name;
    double balance;

    Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

   int getId() {
        return id;
    }

     String getName() {
        return name;
    }

     double getBalance() {
        return balance;
    }

    void checkBalance() {
        System.out.println("Balance for account " + id + ": tk=" + balance);
    }

    void credit(double amount) {
        balance += amount;
        System.out.println( amount +"tk=" + " credited to account " + id);
    }

  void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println( amount + "tk="+" debited from account " + id );
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transferTo(Account anotherAccount, double amount) {
        if (balance >= amount) {
            balance -= amount;
            anotherAccount.credit(amount);
            System.out.println( amount +"tk=" +" transferred from account " + id + " to account " + anotherAccount.getId() );
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }
}

