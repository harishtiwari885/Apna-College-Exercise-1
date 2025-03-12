import java.util.*;
public class CircumferenceOfCircle{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int a = j.nextInt();
        
        double result = roggers(a);
        System.out.println("The Circumfernce of a circle whose radius " + a + " is: " + result);
    }
    public static double roggers(double r){
        double circum = 2 * 3.14159 * r;
        return circum;
    }
}