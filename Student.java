public class Student {
    private final String name;
    private final int rollNumber;
    private final int age;
    private final String department;

    Student(String name, int rollNumber, int age, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    void takeExam() {
        System.out.println(name + " is taking an exam.");
    }

    public static void main(String[] args) {
        Student student = new Student("Asha", 12, 19, "Computer Science");
        student.displayDetails();
        student.takeExam();
    }
}