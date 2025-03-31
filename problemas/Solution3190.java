package problemas;

public class Solution3190 {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[] { 1, 2, 3, 4 }));
    }

    public static int minimumOperations(int[] nums) {

        int result = 0;
        for (int number : nums) {
            if (number % 3 != 0) {
                if (number % 2 != 0) result++;
                else result++;
            }
        }
        return result;
    }
}
