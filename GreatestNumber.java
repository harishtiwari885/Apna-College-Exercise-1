import java.util.*;
public class GreatestNumber{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = j.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = j.nextInt();
        
        int result = ironMan(num1 , num2);
        System.out.println("The Greatest of two number between " + num1 + " and " + num2 + " is : " + result);
        
    }
    public static int ironMan(int a , int b){
        if(a >= b){
            return a;
        }else{
            return b;
        }
    }
}