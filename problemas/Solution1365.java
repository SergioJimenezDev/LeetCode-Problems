package problemas;

public class Solution1365 {
    public static void main(String[] args) {
        System.out.println(smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] array = new int[nums.length];
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]){
                    counter++;
                }
            }
            array[i] = counter;
            counter = 0;
        }

        return array;
        
    }
}
