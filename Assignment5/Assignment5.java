package Assignment5;


import java.util.Scanner;

public class Assignment5 {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.setName("Fido");
        pet1.setAge(3);

        Pet pet2 = new Pet();
        pet2.setName("Furball");
        pet2.setAge(1);

        Pet pet3 = new Pet();
        pet3.setName(null);

        System.out.println("Welcome to the pet store!");
        Mainmenu();
        while (!(Mainmenu().equals("e"))){
            switch (Mainmenu()) {
                case "a":
                    System.out.println(pet1.getName() + " is " + pet1.getAge() + " years old and is");
                    break;
                case "b":
                    pet1.AgeIncrease();
                    pet2.AgeIncrease();
                    break;
                case "c":
                    break;
                case "d":
                    break;
                case "e":
                    break;
                default:
                    break;
        }
        Mainmenu();

        }
        System.out.println("Goodbye.");
    }


    private static String Mainmenu(){
        System.out.println("Type the letter to make your selection.");
        System.out.println("a. List the pets in the store");
        System.out.println("b. Age up the pets.");
        System.out.println("c. Add a new pet.");
        System.out.println("d. Adopt a pet.");
        System.out.println("e. Quit.");
        String choice = scan.nextLine();
        while(!(choice.equalsIgnoreCase("a") ||
        choice.equalsIgnoreCase("b") ||
        choice.equalsIgnoreCase("c") ||
        choice.equalsIgnoreCase("d") ||
        choice.equalsIgnoreCase("e"))) {
            System.out.println("Invalid choice. Please type again.");
            choice = scan.nextLine();
        }
       return choice;
    }
}
