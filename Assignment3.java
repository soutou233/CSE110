import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){

        int inputTimes = 1;
        double sum = 0;
        double input;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type in a number. Type 0 to quit.");
        input = scan.nextDouble();
        scan.nextLine();
        sum = sum + input;
        double max = input;
        double min = input;
        if (input == 0){
            System.out.println("You didn't type anything in.");
            }
            else {
                while (input != 0) {
                    if (max < input) {
                        max = input;
                    }
                    if (min > input) {
                        min = input;
                    }
                    System.out.println("Please type in a number. Type 0 to quit.");
                    input = scan.nextDouble();
                    scan.nextLine();
                    sum = sum + input;
                    inputTimes++;

            }
            System.out.println("The sum of your inputs is: " + sum);
            System.out.println("The total number of inputs you provided was: " + (inputTimes - 1));
            System.out.println("The average of your inputs is: " + (sum/(double)(inputTimes - 1)));
            System.out.println("The highest number you input was: " + max);
            System.out.println("The lowest number you input was: " + min);
        }


    }
}
