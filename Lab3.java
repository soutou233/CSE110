import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your score");
        double score = scan.nextDouble();
        scan.nextLine();

        if (score >=90){
            System.out.println("Your Grade: A");
        }
        else if (score < 90 && score >=80){
            System.out.println("Your Grade: B");
        }
        else if (score < 80 && score >= 60){
            System.out.println("Your Grade: C");
        }
        else {
            System.out.println("Your Grade: D");
        }

        System.out.println("Please type your score2.");
        double score2 = scan.nextDouble();
        scan.nextLine();
        int score3 = ((int)score2) / 10;
        if (score3 > 9){
            System.out.println("Your Grade: A");
        }
        else{

        switch (score3) {
            default:
                System.out.println("Your Grade: D");
                break;
            case 9:
                System.out.println("Your Grade: A");
                break;
            case 8:
                System.out.println("Your Grade: B");
                break;
            case 7:
                System.out.println("Your Grade: C");
                break;
            case 6:
                System.out.println("Your Grade: C");
                break;
        }
        }

        System.out.println("Please type your score3.");
        double inputLoop = scan.nextDouble();
        scan.nextLine();
        int scorenNumber = 3;
        while (inputLoop >= 0) {
            int inputloop2 = ((int) inputLoop) / 10;
            switch (inputloop2) {
                default:
                    System.out.println("Your Grade: A");
                    break;
                case 8:
                    System.out.println("Your Grade: B");
                    break;
                case 7:
                    System.out.println("Your Grade: C");
                    break;
                case 6:
                    System.out.println("Your Grade: C");
                    break;
                case 5:
                    System.out.println("Your Grade: D");
                    break;
                case 4:
                    System.out.println("Your Grade: D");
                    break;
                case 3:
                    System.out.println("Your Grade: D");
                    break;
                case 2:
                    System.out.println("Your Grade: D");
                    break;
                case 1:
                    System.out.println("Your Grade: D");
                    break;
                case 0:
                    System.out.println("Your Grade: D");
                    break;
            }
            scorenNumber++;
            System.out.println("Please type your score" + scorenNumber + ".");
            inputLoop = scan.nextDouble();
            scan.nextLine();
        }
        System.out.println("Please enter a vaild score!");

    }
}
