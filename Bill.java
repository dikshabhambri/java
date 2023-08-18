import java.util.*;
public class Bill {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        Float bill = pencil + pen + eraser;
        System.out.println("your bill is:"+ bill);

        float NewTotal = bill + (0.18f * bill);
        System.out.println("Bill with gst is: " + NewTotal);

    }
    
}