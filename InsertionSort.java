public class InsertionSort {
    public static void Insertionsort(int arr[]){
        for(i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>0 ){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

    }
    //public static void PrintArr(int arr[]){
        
    //}
    public static void main (String ars[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int arr[] = {5,4,1,3,2};
        
        Insertionsort(arr);
        PrintArr(ar);
    }
}
