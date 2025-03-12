import java.util.*;
public class SumofOdd{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = j.nextInt();
        int result = jarvis(num);
        System.out.println("The Sum of Odd Number from 1 to " + num + " is : " + result);
    }
    public static int jarvis(int a){
        int sum= 0;
        for(int b = 1; b <= a ; b += 2){
            sum += b ;
        }
        return sum;
    }
}