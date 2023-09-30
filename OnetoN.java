import java.util.*;
public class OnetoN {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter range");
        int range = sc.nextInt();
        int counter=0;
        while (counter < range){ 
            counter++;
            System.out.println(counter + " ");
        }

    }
}