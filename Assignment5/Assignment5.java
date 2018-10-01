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
                    if (pet3.getName() != null){
                        System.out.println("Please type in a name.");
                        String pet3Name = scan.nextLine();
                        pet3.setName(pet3Name);

                        System.out.println("Type in an age.");
                        int pet3Age = scan.nextInt();
                        scan.nextLine();
                        pet3.setAge(pet3Age);
                    }
                    else {
                        System.out.println("Sorry, the store is full.");
                        break;
                    }
                case "d":
                    System.out.println("Type the number of the pet you would like to adopt.");
                    System.out.println("The number is the order they appear in the list.");
                    int petNumber = scan.nextInt();
                    scan.nextLine();
                    switch (petNumber){
                        case 1:
                            if (!pet1.getAdoptStatus()){
                                System.out.println("You adopted Fido!");
                                pet1.setAdopt();
                                break;
                            }
                            else {
                                System.out.println("Fido was adopted already!");
                                break;
                            }
                        case 2:
                            if (!pet2.getAdoptStatus()){
                                System.out.println("You adopted Furball!");
                                pet2.setAdopt();
                                break;
                            }
                            else {
                                System.out.println("Furball was adopted already!");
                                break;
                            }
                        case 3:
                            if (pet3.getName().equalsIgnoreCase(null)){
                                System.out.println("That is not a valid pet!");
                                break;
                            }
                            else if (!pet3.getAdoptStatus()){
                                System.out.println("You adopted " + pet3.getName() + " !");
                                pet3.setAdopt();
                            }
                            else {
                                System.out.println(pet3.getName() + " was adopted already!");
                            }
                        default:
                            System.out.println("That is not a valid pet!");
                            break;
                    }
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
