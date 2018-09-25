import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("A right triangle of start with base and height of 10");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        int input = scan.nextInt();
        scan.nextLine();

        System.out.print("All the even numbers from 2 to " + input + " are: ");
        if (input % 2 == 0) {
            int inputEven = input + 2;
            for (int loopTimeEven = (input / 2); loopTimeEven > 0; loopTimeEven--) {
                System.out.print((inputEven -= 2) + " ");
            }
        }
        else {
            int inputOdd = input + 1;
            for (int loopTimeOdd = (input / 2); loopTimeOdd > 0; loopTimeOdd--){
                System.out.print((inputOdd-=2) + " ");
            }
        }

        System.out.println("");
        System.out.print("All the odd numbers from 1 to " + input + " are: ");
        if (input % 2 ==0){
            int inputEven2 = input + 1;
            for (int loopTimeEven2 = (input / 2); loopTimeEven2 > 0; loopTimeEven2--){
                System.out.print((inputEven2-=2) + " ");
            }
        }
        else {
            int inputOdd2 = input + 2;
            for (int loopTimeOdd2 = (input / 2); loopTimeOdd2 >= 0; loopTimeOdd2--){
                System.out.print((inputOdd2-=2) + " ");
            }
        }
    }
}
