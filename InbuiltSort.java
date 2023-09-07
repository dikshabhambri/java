import java.util.Arrays;
public class InbuiltSort {

    public static void Inbuiltsort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {5,4,3,1,2};
        Arrays.sort(arr);
        Inbuiltsort(arr);
        
    }
    }
    