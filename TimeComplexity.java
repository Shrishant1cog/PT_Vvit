public class TimeComplexity {

    // O(1): the number of operations does not depend on n.
    static int constantTime(int[] numbers) {
        return numbers[0];
    }

    // O(log n): the search range is divided in half each time.
    static int logarithmicTime(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) {
                return middle;
            }
            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    // O(n): one complete pass through the input.
    static int linearTime(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // O(n log n): merge sort divides the input and then merges each level.
    static void linearithmicTime(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        int middle = numbers.length / 2;
        int[] left = new int[middle];
        int[] right = new int[numbers.length - middle];

        System.arraycopy(numbers, 0, left, 0, left.length);
        System.arraycopy(numbers, middle, right, 0, right.length);
        linearithmicTime(left);
        linearithmicTime(right);
        merge(numbers, left, right);
    }

    private static void merge(int[] numbers, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int numberIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                numbers[numberIndex++] = left[leftIndex++];
            } else {
                numbers[numberIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            numbers[numberIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            numbers[numberIndex++] = right[rightIndex++];
        }
    }

    // O(n^2): two nested loops over the input.
    static long quadraticTime(int n) {
        long operations = 0;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                operations++;
            }
        }
        return operations;
    }

    // O(n^3): three nested loops over the input.
    static long cubicTime(int n) {
        long operations = 0;
        for (int first = 0; first < n; first++) {
            for (int second = 0; second < n; second++) {
                for (int third = 0; third < n; third++) {
                    operations++;
                }
            }
        }
        return operations;
    }

    // O(2^n): each call creates two more calls.
    static long exponentialTime(int n) {
        if (n <= 1) {
            return n;
        }
        return exponentialTime(n - 1) + exponentialTime(n - 2);
    }

    // O(n!): every item is arranged in every possible order.
    static long factorialTime(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialTime(n - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("O(1)       = " + constantTime(numbers));
        System.out.println("O(log n)   = index " + logarithmicTime(numbers, 4));
        System.out.println("O(n)       = " + linearTime(numbers));

        linearithmicTime(numbers);
        System.out.println("O(n log n) = sorted with merge sort");
        System.out.println("O(n^2)     = " + quadraticTime(numbers.length) + " operations");
        System.out.println("O(n^3)     = " + cubicTime(numbers.length) + " operations");
        System.out.println("O(2^n)     = " + exponentialTime(numbers.length));
        System.out.println("O(n!)      = " + factorialTime(numbers.length));
    }
}