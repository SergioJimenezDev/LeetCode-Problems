package problemas;

public class Solution1470 {
    public static void main(String[] args) {
        System.out.println(shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n]; 
        }

        return ans;
    }

}
