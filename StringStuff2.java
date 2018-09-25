import java.util.Scanner;

public class StringStuff2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str.substring(4, 5));

        System.out.println(str.replace("", ""));


        scan.close();
    }
}
