import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a word or phrase.");
        String str = scan.nextLine();

        System.out.println("Please input the string you would like to search for in your word or phrase.");
        String substr = scan.nextLine();

        System.out.println("Do you want to consider spaces? Type 1 for Yes, or 0 for No.");
        String spaceAdjust = scan.nextLine();
        int spaceAdjust2 = Integer.parseInt(spaceAdjust);
        if (spaceAdjust2 == 0) {
            str = str.replaceAll(" ", "");
            substr = substr.replaceAll(" ", "");
        }
        else {
            System.out.println("Do you want to consider uppercase and lowercase as different? 1 for Yes, 0 for No.");
            String caseAdjust = scan.nextLine();
            int caseAdjust2 = Integer.parseInt(caseAdjust);
            if (caseAdjust2 == 0) {
                str = str.toLowerCase();
                substr = substr.toLowerCase();
            }
            else {
                if (substr.equals(str)){
                    System.out.println("Your search is equal to the entire input.");
                }
                else if (!str.contains(substr)){
                    System.out.println("Your search was not found in the input.");
                }
                else {
                    if (str.startsWith(substr)){
                        System.out.println("Your search is the start of input.");
                    }
                    else if (str.endsWith(substr)){
                        System.out.println("Your search is the end of input.");
                    }
                    else {
                        System.out.println("Your search start at index " + (str.indexOf(substr)) + " and ends at index " + ((str.indexOf(substr) + substr.length()) - 1) + " .");
                    }
                }
            }


        }
        scan.close();



    }
}
