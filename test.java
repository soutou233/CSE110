import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number");
        String str = scan.nextLine();
        int num2 = Integer.parseInt(str);

        Double num1 = new Double(5);
        Double num2 = new Double(5);

        System.out.println(num1);
        System.out.println(num2);
    }
}
