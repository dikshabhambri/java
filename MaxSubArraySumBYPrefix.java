import java.util.*;
import java.io;
public class MaxSubArraySumBYPrefix {
    public static void MaxSubSumPrefix(int numbers[]){
        int currSum =0;
        int MaxSum= Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] - numbers[i];

        }

        for(int i=0;i<numbers.length; i++){
            for (int j=i; j<numbers.length; j++){
                currSum= i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(currSum>MaxSum){
                    currSum = MaxSum;
                }
                
            }
        }
        System.out.println(MaxSum);
    }
    public static void main (String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSubSumPrefix(numbers);
    }
}
