import java.util.*;
public class MethodAvg3 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();
        System.out.println("Enter Third number");
        int n3 = sc.nextInt();
        System.out.println("the avg is: "+ average(n1,n2,n3));
        
    }
    public static int average(int n1, int n2, int n3){
        return (n1+n2+n3)/3;

    }
}