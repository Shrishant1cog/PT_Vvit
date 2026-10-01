public class PetShop {
    static void makePetSound(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            System.out.println("Bow wow!");
        } else if ("cat".equalsIgnoreCase(type)) {
            System.out.println("Meow!");
        } else {
            System.out.println("That pet is not in the shop.");
        }
    }

    public static void main(String[] args) {
        makePetSound("dog");
        makePetSound("cat");
    }
}