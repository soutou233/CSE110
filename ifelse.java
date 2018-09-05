import java.util.Scanner;

public class ifelse {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println();

        int input = scan.nextInt();

        if(input == 0){
            System.out.println("It was 0");
            input++;
        }
        else if(input > 0){
            System.out.println("> 0");
        }
        else{
            System.out.println("< 0");
        }



        scan.close();
    }
}
