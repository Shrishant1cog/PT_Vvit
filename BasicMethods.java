public class BasicMethods {
    static void display(String text) {
        System.out.println(text);
    }

    static void display(int number) {
        System.out.println(number);
    }

    static void squareExpansion(int first, int second) {
        int result = first * first + 2 * first * second + second * second;
        System.out.println("(a + b)^2 = " + result);
    }

    static int add(int first, int second) {
        return first + second;
    }

    static void welcome(String name, int age) {
        System.out.println("Welcome " + name + ". You are " + age + " years old.");
    }

    public static void main(String[] args) {
        display("Hello, Java!");
        display(10);
        squareExpansion(2, 3);
        System.out.println("Addition: " + add(4, 5));
        welcome("Asha", 19);
    }
}