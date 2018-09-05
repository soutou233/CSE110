import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.Scanner;

public class StringStuff {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Type a String");
        String str = scan.nextLine();
        //str = str.toUpperCase(); // change str to uppercase(hello=HELLO)

        int num = Integer.parseInt(str);
        double num2 = Double.parseDouble(str);
        System.out.println(Integer.MAX_VALUE + 1); //back to the smallest value.

        System.out.println(str.equals("hello"));
        System.out.println(str.equalsIgnoreCase("hello")); //ignore capital letter// problem
        System.out.println(str.toUpperCase()); //all letters change to upper letter.
        System.out.println(str.toLowerCase()); //all letters change to lower letter.

        System.out.println(str.length()); // show the length of our input

        System.out.println(str.startsWith("H")); // compare it start with some particular content or not. (Can more than one char)
        System.out.println(str.endsWith("o"));
        System.out.println(str.contains("ell")); // just contain some contents or not.(recognize upper or lower)

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("L" , str.indexOf("L" + 1)));

        System.out.println(str.concat(", World"));
        System.out.println(str + "char");



        scan.close();
    }
}
