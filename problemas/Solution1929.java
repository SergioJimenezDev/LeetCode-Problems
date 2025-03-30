package problemas;

import java.util.Arrays;

public class Solution1929 {
    public static void main(String[] args) {
        for (int number : getConcatenation(new int[] { 1, 2, 1 })) {
            System.out.println(number);
        }

        getConcatenation(new int[] { 1, 2, 1 });
    }

    public static int[] getConcatenation(int[] nums) {

        int[] ans = Arrays.copyOf(nums, nums.length * 2);

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }

        return ans;
    }

}
