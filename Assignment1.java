import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the velocity(in feet per second) of the cannonball.");
        double velocity = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter the angle(in degrees) the cannonball wii be shot at.");
        double angle = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter the distance(in feet) to the target.");
        double distance = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter the elevation(in feet) of the bottom of the target.");
        double elevation = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter the size(in feet) of the target.");
        double size = scan.nextDouble();
        scan.nextLine();

        scan.close();

        angle = Math.toRadians(angle);
        double velocityX= velocity * Math.cos(angle);
        if (velocityX == 0){
            System.out.println("The distance cannot be calculated with the value 0.");
        }
        else{
            double time = distance / (velocityX);
            double height = velocity * time * Math.sin(angle) - ((32.17 * Math.pow(time, 2) / 2));
            if (height < 0){
                System.out.println("The cannonball will not reach the target.");
            }
            else if ((height > 0) && (height < elevation)){
                System.out.println("The height of the cannonball is" + height + "and the cannonball will under the target.");
            }
            else if ((height > elevation) && (height < elevation + size)){
                System.out.println("The cannonball hit the target!");
            }
            else if (height > (elevation + size)){
                System.out.println("The height of the cannonball is " + height + " and the cannonball will over the top of the target.");
            }
        }




    }
}