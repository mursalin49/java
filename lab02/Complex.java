import java.util.Scanner;

public class Complex {
    int real;
    int imag;

    // Default constructor
    public Complex() {
        real = 0;
        imag = 0;
    }

    // Parameterized constructor
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Read function to take keyboard input
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real and imaginary numbers respectively: ");
        real = scanner.nextInt();
        imag = scanner.nextInt();
    }

    // Add function to add two complex numbers and return the result as a new object
    public Complex add(Complex other) {
        int sumReal = this.real + other.real;
        int sumImag = this.imag + other.imag;
        return new Complex(sumReal, sumImag);
    }

    // Display function to print the complex number
    public void display() {
        System.out.println("Sum = " + real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        // Creating objects and performing addition
        Complex complex1 = new Complex();
        complex1.read();

        Complex complex2 = new Complex();
        complex2.read();

        Complex sum = complex1.add(complex2);

        // Displaying the result
        sum.display();
    }
}