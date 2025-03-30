package problemas;

public class Solutions1512 {
    public static void main(String[] args) {
        numIdenticalPairs(new int[]{1,2,3,1,1,3});
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        
        int count = 0;
        for(int i = 0; i<nums.length - 1; i++){
            for(int j = i + 1; j< nums.length; j++){
                if(nums[i]==nums[j])
                count ++;
            }
        }
        return count;
    }
}
