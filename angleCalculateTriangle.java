import java.util.Scanner;

/**
 * Created by Sai on 12/27/2016.
 */
public class angleCalculateTriangle
{
    public static double third_angle(double a, double b, double c) {
        return Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2.0 * c * a));
        //Calculating the angle opposite to side "a" and "c"
    }
    public static double second_angle(double a, double b, double c) {
        return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2.0 * a * b));
        //Calculating the angle opposite to side "a" and "b"
    }
    public static double first_angle(double a, double b, double c) {
        return Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2.0 * b * c));
        //Calculating the angle opposite to side "b" and "c"
    }

    public static void main(String[] args) {
        System.out.println("Enter three sides of triangle named a, b, c: ");
        Scanner scanner_object = new Scanner(System.in);    // Initialized the scanner class object which later will be used to get sides of triangle from user.
        double a = scanner_object.nextDouble();       //Getting side one as Double
        double b = scanner_object.nextDouble();       //Getting side two as Double
        double c = scanner_object.nextDouble();       //Getting side three as Double

        /* NOTE: You can change the type of parameters a, b, c by changing the next part of the above three statements. (12, 13, 14)*/
        /* Printing out the areas */
        if (a == 0.0 || b == 0.0 || c == 0.0)
        {
            System.out.println("Side cannot be Zero!");
        }
        else
        {
            System.out.println("First angle: " +(int) Math.round(Math.toDegrees(first_angle(a, b, c))) +
                    " Degrees\nSecond angle: " + (int) Math.round(Math.toDegrees(second_angle(a, b, c))) +
                    " Degrees\nThird angle: " + (int) Math.round(Math.toDegrees(third_angle(a, b, c)))+ " Degrees");
        }
    }
}
