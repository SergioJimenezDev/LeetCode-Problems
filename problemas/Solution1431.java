package problemas;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] { 2, 8, 7 }, 1));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        Integer max = 0;

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] > max) {
                max = candies[i];
            }

        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;

    }
}
