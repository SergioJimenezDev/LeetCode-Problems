package problemas;

import java.util.Arrays;

public class Solution1051 {
    public static void main(String[] args) {

        int[] heights = { 1, 1, 4, 2, 1, 3 };

        heightChecker(heights);
    }

    public static int heightChecker(int[] heights) {

        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        Integer total = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                total++;
            }
        }

        return total;
    }
}
