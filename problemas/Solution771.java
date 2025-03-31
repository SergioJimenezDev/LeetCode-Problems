package problemas;

public class Solution771 {
    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {

        Integer result = 0;

        for (int i = 0; i < jewels.length(); i++) {
            String letraJ = jewels.substring(i, i + 1);
            for (int j = 0; j < stones.length(); j++) {
                String letraS = stones.substring(j, j + 1);
                if (letraJ.equals(letraS)) {
                    result++;
                }
            }
        }

        return result;
    }

}
