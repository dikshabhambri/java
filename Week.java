import java.util.*;
public class Week{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number:");
        int Number = sc.nextInt();
        switch (Number){
            case 1 : System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5 : System.out.println("Frday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            default : System.out.println("No such say exists");
            

        }
    


    }
}