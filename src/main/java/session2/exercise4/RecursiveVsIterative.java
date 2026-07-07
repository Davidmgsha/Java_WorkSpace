package session2.exercise4;
public class RecursiveVsIterative {
    public static long factorialIterative(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }
    public static long fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long first = 0;
        long second = 1;

        for (int i = 2; i <= n; i++) {
            long next = first + second;
            first = second;
            second = next;
        }

        return second;
    }
    public static long fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("Factorial Comparison");
        for (int n = 0; n <= 15; n++) {
            long iterativeFactorial = factorialIterative(n);
            long recursiveFactorial = factorialRecursive(n);

            if (iterativeFactorial != recursiveFactorial) {
                throw new AssertionError(
                        "Factorial results do not match for n = " + n);
            }

            System.out.println(
                    "n = " + n +
                            " Iterative = " + iterativeFactorial +
                            " Recursive = " + recursiveFactorial);
        }

        System.out.println("\nFibonacci Comparison");
        for (int n = 0; n <= 15; n++) {
            long iterativeFibonacci = fibonacciIterative(n);
            long recursiveFibonacci = fibonacciRecursive(n);

            if (iterativeFibonacci != recursiveFibonacci) {
                throw new AssertionError(
                        "Fibonacci results do not match for n = " + n);
            }

            System.out.println(
                    "n = " + n +
                            " Iterative = " + iterativeFibonacci +
                            " Recursive = " + recursiveFibonacci);
        }
    }
}

/*
 - Deep recursion can cause a StackOverflowError because each recursive call
 consumes stack memory. If the recursion depth becomes too large, the call
 stack runs out of space and the program crashes.
 - Recursive Fibonacci is especially inefficient because it repeatedly
 recalculates the same values, causing the number of recursive calls to grow
 exponentially. Depending on the JVM and available stack size, a
 StackOverflowError may occur for large values of n (typically several
 thousands), while performance becomes very slow much earlier.
 */