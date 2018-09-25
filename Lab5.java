import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type number1.");
        double input1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please type number2.");
        double input2 = scan.nextDouble();
        scan.nextLine();
        System.out.println(("The sum of the two numbers you type in is: ") + getSum(input1, input2));
        System.out.println(("The average number of the two numbers you type in is: ") + getAverage(input1, input2));


        System.out.println("Please type your name.");
        String name = scan.nextLine();

        System.out.println("Please type your midterm score.");
        double midtermScore = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please type you final score.");
        double finalScore = scan.nextDouble();
        scan.nextLine();

        StudentBasicinfo(name, midtermScore, finalScore);

        StudentInfo(name, midtermScore, finalScore);
    }

    public static double getSum(double num1, double num2) {
        return num1 + num2;
    }
    public static double getAverage(double num1, double num2){
        return ((num1 + num2) / 2);
    }
    public static void StudentBasicinfo(String name, double midtremScore, double finalScore){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please type your name.");
//        String name = scan.nextLine();
//        System.out.println("Please type your midterm score.");
//        double midtremScore = scan.nextDouble();
//        System.out.println("Please type you final score.");
//        double finalScore = scan.nextDouble();
        System.out.println("Your name: " + name);
        System.out.println("Your midterm score: " + midtremScore);
        System.out.println("Your final score: " + finalScore);
        System.out.println("===============================");

    }
    public static void StudentInfo(String name, double midtermScore, double finalScore){

        double grade = getAverage(midtermScore, finalScore);

        System.out.println("Your name: " + name);
        System.out.println("Your midterm score: " + midtermScore);
        System.out.println("Your final score: " + finalScore);
        System.out.println("Your grade: " + grade);


    }
}
