import java.util.*;
public class RrayListReverse{
    

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int i = sc.nextInt();
        for(i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i));
        }
    }
}
