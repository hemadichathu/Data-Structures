public class ExcessiveRecursion {

    public static long factorial(int n) {
        // Base case
        if (n == 0) return 1;
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 20; // Adjust this number to see how it impacts recursion depth
        try {
            System.out.println("Factorial of " + number + " is " + factorial(number));
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow error due to excessive recursion.");
        }
    }
}