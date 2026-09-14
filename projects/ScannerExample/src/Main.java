import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name  = scanner.nextLine();

        System.out.print("Enter you name again:"); //The answer to the question will be on the same line
        String nameAgain = scanner.next();  //Next does not count spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA?: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean aStudent = scanner.nextBoolean();

        System.out.println("Hello, " + name);
        System.out.println("Hello, " + nameAgain);
        System.out.println("Your age is " + age + "years old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("Student: " + aStudent);






        //If you do not close your scanner it will have unexpected behaviour
        scanner.close();
    }
}
