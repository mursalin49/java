class EvenOddPrinter {
     static final int MAX_NUMBER = 20;

    public static void main(String[] args) {
        // Creating two threads for even and odd numbers
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        // Starting both threads
        evenThread.start();
        oddThread.start();
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100); // Adding a small delay for better readability
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100); // Adding a small delay for better readability
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
