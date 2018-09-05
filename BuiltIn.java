import java.util.Random;
import java.util.Scanner;

public class BuiltIn {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println(Math.toRadians(45));
        System.out.println(rand.nextInt(10));





        scan.close();
    }

}
