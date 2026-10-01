public class trycatchdemo {
    public static void main(String[] args) {
        int number = 2;
        int divisor = 0;
        try {
            int solution = number / divisor;
            System.out.println("Answer: " + solution);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
        finally {
            System.out.println("Cleanup code executed.");
        }
    }
}
