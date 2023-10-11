import java.util.*;

public class Question2 {
    public staitc void main (String argd[]){
        Scanner sc = new Sanner(System.in){
            int number;
            int choice;
            int evenSum;
            int oddSum;
            System.out.println("Enter your number");
            number sc = sc.nextInt();
            if (number%2==0){
                evenSum += number;

            } else{
                oddSum = oddSum += number;
            
            }
            System.out.println("The sum of odd numbers is:" + oddSum);
            System.out.println("The sum of even numbers is:" + evenSum);

        }
    }
}