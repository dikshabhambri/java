public class PrintPairsArray {
    public static void PrintPairs(int numbers[]){
        for ( int i=0; i<numbers.length; i++){
            //int curr= numbers[i];
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("(" + numbers[i] + "," + numbers[j]+ ")" );
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,7, 8};
        PrintPairs(numbers);
    }
    }


