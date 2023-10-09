import java.util.*;
public class Prodof2NFn {
    public static void Product (int a, int b){
        int product = a*b;
        System.out.println("Product is:" + product); 
    }
    public static void main (String args[]){
        int a = 5;
        int b = 5;
        Product(a,b);
        Product(10,20);
    }
}