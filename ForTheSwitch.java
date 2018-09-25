import java.util.Scanner;

public class ForTheSwitch {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int input = scan.nextInt();

        int counter = 0;

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int sum =0;

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num2; j++){
                sum++;
            }
        }

        System.out.println(sum);

        int counter2;
        // do xxxx until satisfied the condition in the while.
        // which means the do...while loop at least loop one time.
        do{
            counter2 = 0;
            System.out.println(counter2++);
        }while (counter2 < 10);


        switch (input) {
            //case -1:  No break, so go to case 0 until break.
            case 0:
                System.out.println("Nothing");
                break;
            case 1:
                System.out.println("There is on I in teami");
                break;
            case 2:
                System.out.println("Two to too");
                break;
            default:
                System.out.println("default");
                break;
        }

        String str = scan.nextLine();

        switch(str){
            case "Hello":
                System.out.println();
        }
    }
}
