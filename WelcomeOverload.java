public class WelcomeOverload {
    void welcome() {
        System.out.println("Welcome to VVIT!");
    }

    void welcome(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {
        WelcomeOverload example = new WelcomeOverload();
        example.welcome();
        example.welcome("Asha");
    }
}