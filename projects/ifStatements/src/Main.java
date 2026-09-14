import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //if statement performs a block of code if its condition is true
        Scanner scanner= new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter your name");
        name = scanner.nextLine();


        //GROUP 1: NAME
        if(name.isEmpty()){
            System.out.println("You did not enter a name! 😒");
        }else{
            System.out.println("Hello "+name+"!");
        }

        //GROUP 2: AGE
        System.out.println("Enter your age?");
        age = scanner.nextInt();

        if(age >= 65){
        System.out.println("You are nearly dead");
        }
        else if (age >= 18){
            System.out.println("You are an adult");
        }
        else if(age < 0){
            System.out.println("You have not been born yet fetus");
        }
        else if(age == 0){
            System.out.println("You are a darn cute baby");
        }
        else{
            System.out.println("You are an child");
        }

        System.out.println("Are you a student? (true/false)");
        isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("You are not a student");
        }
        scanner.close();

    }
}
