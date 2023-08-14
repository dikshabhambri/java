import java.util.*;
class ArrayIndex {
    public static int linerSearch (int numbers[], int key){
        for(int i=0; i<numbers.length;i++){
            if (numbers [i] == key){
                return i;


            }

        }
        return -1;
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key= 10;
        int index = linerSearch(numbers,key);
        if (index==-1){
            System.out.println("key not found");
            
        }
        else{
            System.out.println("The key is found at index : "+index);
        }
    }
}