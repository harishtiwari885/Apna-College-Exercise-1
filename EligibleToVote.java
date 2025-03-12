import java.util.*;
public class EligibleToVote{
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int num = j.nextInt();
        captainAmerica(num);
    }
    public static void captainAmerica(int age){
        if(age < 1){
            System.out.println("Invalid Input!");
        }
        else if(age >= 18){
            System.out.println("You are Eligible to Vote Buddy");
        }
        else{
            System.out.println("Focus on your Career Kid!");
        }
    }
}