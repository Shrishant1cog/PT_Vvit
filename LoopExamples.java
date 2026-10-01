public class LoopExamples {
    static void printNumbersWithContinueAndBreak() {
        for (int number = 0; number < 10; number++) {
            if (number == 3 || number == 5) {
                continue;
            }
            if (number == 8) {
                break;
            }
            System.out.println(number);
        }
    }

    static boolean isArmstrongNumber(int number) {
        if (number < 0) {
            return false;
        }

        int digitCount = String.valueOf(number).length();
        int remaining = number;
        int sum = 0;
        while (remaining > 0) {
            int digit = remaining % 10;
            int digitPower = 1;
            for (int count = 0; count < digitCount; count++) {
                digitPower *= digit;
            }
            sum += digitPower;
            remaining /= 10;
        }
        return sum == number;
    }

    static void printArmstrongNumbers() {
        for (int number = 100; number <= 999; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    static void checkArmstrongNumber(int number) {
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    static void printSquarePattern(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printNumberSquare(int size) {
        int count = 0;
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print(size + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("The inner statement ran " + count + " times.");
    }

    static void countCubeLoops(int size) {
        int count = 0;
        for (int first = 0; first < size; first++) {
            for (int second = 0; second < size; second++) {
                for (int third = 0; third < size; third++) {
                    count++;
                }
            }
        }
        System.out.println("The three loops ran " + count + " times.");
    }

    public static void main(String[] args) {
        printNumbersWithContinueAndBreak();
        printArmstrongNumbers();
        checkArmstrongNumber(153);
        printSquarePattern(3);
        printNumberSquare(2);
        countCubeLoops(2);
    }
}