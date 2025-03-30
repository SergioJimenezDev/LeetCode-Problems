package problemas;

import java.util.HashSet;
import java.util.Set;

public class Solution3289 {
    public static void main(String[] args) {

        System.out.println(getSneakyNumbers(new int[] { 0, 1, 1, 0 }));

        for (int string : getSneakyNumbers(new int[] { 0, 1, 1, 0 })) {
            System.out.println(string);
        }
    }

    public static int[] getSneakyNumbers(int[] nums) {

        Set<Integer> ans = new HashSet<>();

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                    if (counter == 2) {
                        ans.add(nums[i]);
                        counter = 0;

                    }

                }
            }
            counter = 0;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
