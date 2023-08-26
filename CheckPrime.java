import java.util.*;
public class CheckPrime {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        if (n==2){
            System.out.println("prime");
        } else {
        Boolean isPrime;
        
        isPrime = true;
        for (int i=2; i<= n-1; i++){
            if (n % i == 0){
        isPrime = false;
        }
    }
        if (isPrime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        }
    }
}
