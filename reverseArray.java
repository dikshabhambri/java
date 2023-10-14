import java.util.*;
public class SwapArray {
    public static int reverseArray(int numbers[]){
        int start = 0, end= numbers.length - 1;
        while (start<end){
        int temp = numbers[end];
        numbers[end] = numbers[start];
        numbers[start]= temp;
        start++;
        end--;

    }
}
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10};
        reverseArray(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");

        }
    }
}