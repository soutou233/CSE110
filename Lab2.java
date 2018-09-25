import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the age.");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter the number1.");
        double num1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter the number2.");
        double num2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter the first name.");
        String firstName = scan.next();
        scan.nextLine();

        System.out.println("Please enter the last name.");
        String lastName = scan.next();
        scan.nextLine();

        scan.close();


        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is " + age + " years old");

        fullName = fullName.toUpperCase();
        System.out.println("Uppercase full name is " + fullName);

        if (num1 > 2){
            System.out.println("Number1 is bigger than number2.");
        }
        else if (num1 < num2){
            System.out.println("Number2 is bigger than number1.");
        }
        else {
            System.out.println("Number1 is equal to number2.");
        }
    }
}
