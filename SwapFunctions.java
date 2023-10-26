import java.util.*;
public class SwapFunctions {
    public static void swap (int a, int b){
        int temp = a;
        a=b;
        b = temp;
        System.out.println("value of a is:" + a);
        System.out.println("value of b is:" + b);

    }
    public static void main (String args[]){
        int a =5;
        int b = 10;
        swap (a, b);
    }
    
}