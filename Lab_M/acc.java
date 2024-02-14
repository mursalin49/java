package lab_mid;

public class acc {

    public static void main(String[] args) {

        Account account1 = new Account(1, "Nirob", 1000);
        Account account2 = new Account(2, "arifin", 2000);


        account1.checkBalance();
        account2.checkBalance();


        double amountToTransfer = 500;
        account1.transferTo(account2, amountToTransfer);


        account1.checkBalance();
        account2.checkBalance();
    }
}
