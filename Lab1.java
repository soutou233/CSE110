import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type an integer.");

        int interInput = scan.nextInt();
        scan.nextLine();

        System.out.println("You typed in:" + interInput);


        System.out.println("Please type another integer");

        int interInput2 = scan.nextInt();
        scan.nextLine();

        System.out.println("You typed in:" + interInput2);


        System.out.println("======================="); // Just help to see the output more clear.

        System.out.println("Addition = " + (interInput + interInput2) );
        System.out.println("Subtraction = " + (interInput - interInput2) );
        System.out.println("Multiplication= " + (interInput * interInput2) );
        System.out.println("Integer Division= " + interInput / interInput2);
        System.out.println("Modulus= " + interInput % interInput2);


        scan.close();


    }
}
