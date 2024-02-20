import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Enter any positive integer:");
        int num = input.nextInt();
        int count = 0;
        if (num == 0 || num == 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }


            if (count == 0) {
                System.out.println(" prime number");

            } else {
                System.out.println(" not prime");
            }
        }

    }
}