public class ArrayExamples {
    static void printArrayStatistics(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double mean = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }

    static void printTwoDimensionalArray(int rows, int columns) {
        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be greater than zero.");
            return;
        }

        int[][] numbers = new int[rows][columns];
        int nextNumber = 1;
        int sum = 0;
        for (int[] row : numbers) {
            for (int column = 0; column < row.length; column++) {
                row[column] = nextNumber;
                sum += nextNumber;
                System.out.print(row[column] + " ");
                nextNumber++;
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }

    static void findTwoSum(int[] numbers, int target) {
        for (int first = 0; first < numbers.length; first++) {
            for (int second = first + 1; second < numbers.length; second++) {
                if (numbers[first] + numbers[second] == target) {
                    System.out.println("Indexes: " + first + " and " + second);
                    return;
                }
            }
        }
        System.out.println("No two numbers add up to " + target + ".");
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 4, 9, 6};
        printArrayStatistics(numbers);
        findTwoSum(numbers, 10);
        printTwoDimensionalArray(2, 3);
    }
}