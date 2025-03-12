import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = j.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = j.nextInt();
        System.out.print("Enter third Number: ");
        int num3 = j.nextInt();
        
        double result = mean(num1, num2, num3);
        System.out.println("The Average of 3 Numbers is: " + result);
    }

    public static double mean(int a, int b, int c) {
        double res1 = (a + b + c) / 3.0;  // Using 3.0 to ensure division returns a double
        return res1;
    }
}