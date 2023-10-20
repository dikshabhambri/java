import java.util.*;
class SmallestOfArray{
    public static int GetSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main (String args[]){
        int numbers[]= {2,1,5,7,3,9};
        System.out.println("the smallest number is: " + GetSmallest(numbers));
    }
}