import java.util.*;
public class Sort{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        //arr = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println(arr);
}
    }
    