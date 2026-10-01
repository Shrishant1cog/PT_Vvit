public class RecursionExamples {
    static void printNumbersFromOne(int number) {
        if (number <= 0) {
            return;
        }
        printNumbersFromOne(number - 1);
        System.out.println(number);
    }

    static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must not be negative.");
        }
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    static void printFibonacci(int count) {
        printFibonacci(count, 0, 1);
    }

    private static void printFibonacci(int count, int first, int second) {
        if (count <= 0) {
            return;
        }
        System.out.println(first);
        printFibonacci(count - 1, second, first + second);
    }

    public static void main(String[] args) {
        printNumbersFromOne(5);
        System.out.println("5! = " + factorial(5));
        printFibonacci(7);
    }
}