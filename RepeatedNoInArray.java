public class RepeatedNoInArray {
    public static boolean RepeatedNo (int nums[]){
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    return true;
                }
                
                
            }
        }

        return false;
    }
    public static void main (String args[]){
        int nums[] = {2, 4, 6, 5};
        System.out.println(RepeatedNo(nums));
    }
}
