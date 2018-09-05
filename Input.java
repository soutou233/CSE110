import java.util.Scanner; //import the method that we need for Scanner.

public class Input {


    public static void main(String[] args) {

        //new meaning not the thing already exist.
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number");
        int input = scan.nextInt();

        scan.nextLine(); //Eat the new line

        System.out.println("Type anything");
        String str = scan.nextLine();

        System.out.println("The number is " + input);
        System.out.println("The String is " + str);

        int c = 1;
        c++;
        c +=1;

        System.out.println(c);

        scan.close();

    }
}
