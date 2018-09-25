import java.util.Scanner;

public class Loopage {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        int count = 0;
//
//        while (count < 10) {
//            System.out.println("Count is " + count);
//            count++;
//        }
//
//        int count2 = 0;
//
//        while (count2 < 10) {
//            count2++;
//            if (count2 >= 10){
//                break;
//            }
//            System.out.println("Count2 is " + count2);
//        }
//
//        int otherCount = 0;
//        while (count2 < 20) {
//            otherCount =0; //this variable is not working in global. Only in the while.
//            otherCount++;
//            count++;
//        }

        int num = 10;
        while (num < 10) {
            num -= 1000000;
        }

        System.out.println("Type in A or B");
        String input = scan.nextLine();

        while (!input.equals("A") && !input.equals("B")) {
            System.out.println("Learn to read.");
            System.out.println("Type again!");
            input = scan.nextLine();
        }

        System.out.println("You did it!");

//        System.out.println("othercount: " + otherCount);
//
//        System.out.println("After loop " + count); //10
//        System.out.println("After loop2 " + count2);
    }
}
