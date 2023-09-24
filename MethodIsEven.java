import java.util.*;
public class MethodIsEven {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Enter any integer");
        num = sc.nextInt();
        if (isEven(num)){
            System.out.println("the number is even");
            
        }
        else {
            System.out.println("The number is odd");
        }
    }
    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}