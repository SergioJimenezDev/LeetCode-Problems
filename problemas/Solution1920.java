package problemas;

public class Solution1920 {
    public static void main(String[] args) {
        buildArray(new int[]{0,2,1,5,3,4});

        for (int string : buildArray(new int[]{0,2,1,5,3,4})) {
            System.out.println(string);
        }
    }

    public static int[] buildArray(int[] nums) {
        
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

}
