public class Calculator {
    static void calculate(char operation, double first, double second) {
        switch (operation) {
            case '+' ->
                System.out.println("Answer: " + (first + second));
            case '-' ->
                System.out.println("Answer: " + (first - second));
            case '*' ->
                System.out.println("Answer: " + (first * second));
            case '/' -> {
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Answer: " + (first / second));
                }
            }
            default ->
                System.out.println("Use +, -, *, or /.");
        }
    }

    public static void main(String[] args) {
        calculate('+', 10, 5);
        calculate('-', 10, 5);
        calculate('*', 10, 5);
        calculate('/', 10, 5);
    }
}