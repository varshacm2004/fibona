public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Change this value to generate Fibonacci series of different lengths
        System.out.println("Fibonacci Series of length " + n + ":");
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); // Print the first two Fibonacci numbers

        for (int i = 2; i < n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

