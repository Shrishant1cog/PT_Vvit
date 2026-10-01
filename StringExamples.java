public class StringExamples {
    static void printStringExamples() {
        String city = "Bengaluru";
        String first = "Java";
        String second = new StringBuilder("Java").toString();

        System.out.println("City length: " + city.length());
        System.out.println("City in uppercase: " + city.toUpperCase());
        System.out.println("The city is Bengaluru: " + city.equals("Bengaluru"));
        System.out.println("Same object: " + sameObject(first, second));
        System.out.println("equals compares the text: " + first.equals(second));
        System.out.println("Java programming score: " + 95);
    }

    static boolean sameObject(Object first, Object second) {
        return first == second;
    }

    static int countVowels(String text) {
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            char letter = Character.toLowerCase(text.charAt(index));
            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        printStringExamples();
        System.out.println("Vowels: " + countVowels("Hello, Java!"));
    }
}