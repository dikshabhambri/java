import java.util.*;

public class Factorial {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num;
    int fact=1;
    int i;
    
    System.out.println("Enter any positive integer");
    num= sc.nextInt();
    for(i=1; i<=num; i++){
        fact *= i;
    }

    System.out.println("Factorial: " + fact);
}
}