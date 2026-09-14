public class Main {
    public static void main(String[] args){ //this is needed to get your program to run

        // THIS IS MY FIRST JAVA PROGRAM

        /*
            This
            is
            a
            multi-line
            comment
         */

        System.out.println("I like pancakes");
        System.out.println("It's really good!");
        System.out.println("Buy me pancakes!");
        //SOUT and tab auto gens the above function
        //VARIABLES
        int age = 30;
        System.out.println("I am " + age + " years old");
        int year = 2026;
        System.out.println("The year is " + year);
        int quantity = 1;
        if(quantity > 1){
            System.out.println("I have " + quantity + " pancakes");
        } else {
            System.out.println("I have " + quantity + " pancake");
        }

        double price = 1999.99;
        System.out.println("The price is $" + price);

        double GPA = 3.5;
        System.out.println("My GPA is " + GPA);

        double temperature = -12.5;
        System.out.println("The temperature is " + temperature + " degrees");


        //CHARS ARE SINGLE QUOTES
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("I got a grade of " + grade + " on my test");
        System.out.println("this is the currency: " + currency + " of the United States");
        System.out.println("this is the symbol: " + symbol + " for excitement");
    


        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

        System.out.println("Is the item for sale? " + forSale);
        
        System.out.println("Is the user a student? " + isStudent);

        if(isStudent){
            System.out.println("The user is a student");
        }else{
            System.out.println("The user is NOT a student");
        };

        if(forSale){
            System.out.println("The item is for sale");
        }else{
            System.out.println("The item is NOT for sale");
        };

        if(isOnline){
            System.out.println("You are online");
        }else{
            System.out.println("You are NOT online");
        }

        //STRINGS ARE DOUBLE QUOTES
        String name = "Hayley Billingham";
        System.out.println("My name is " + name);
        String food = "pancakes";
        System.out.println("I like to eat " + food);
        String email = "fake@example.com";
        System.out.println("My email is " + email);
        String car = "Aston Martin";
        String color = "Red";
        System.out.println("I drive a " + color + " " + car);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like to eat " + food);

        if(forSale){
            System.out.println("The " + color + " " + car + " is for sale for $" + price);
        }else{
            System.out.println("The " + color + " " + car + " is NOT for sale");
        }


    }
}
