package problemas;
import java.util.Arrays;

public class Solution561 {

    public static void main(String[] args) {
        int[] array = { 6, 2, 6, 5, 1, 2 };
        System.out.println(arrayPairSum(array));
    }

    public static int arrayPairSum(int[] nums) {
        Integer total = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {

            total += nums[i];

        }

        return total;
    }
}
