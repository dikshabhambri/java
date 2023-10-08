public class PrintSubarrays {
    public static void PrintSubarray (int numbers[]){
        int ts=0; //total subarrays
        for (int i=0; i<numbers.length; i++){
            for (int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);


    }
    public static void main (String args[]){
        int numbers[] = {2, 4, 5, 7};
        PrintSubarray(numbers);
       
    }
}
