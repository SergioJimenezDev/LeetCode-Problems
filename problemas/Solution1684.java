package problemas;

public class Solution1684 {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[] { "ad", "bd", "aaab", "baa", "badab" }));
    }

    public static int countConsistentStrings(String allowed, String[] words) {

        Integer result = 0;
        Boolean esta = true;

        for (int i = 0; i < words.length; i++) {
            String[] word = words[i].split("");
            for (int j = 0; j < word.length; j++) {
                if (!allowed.contains(word[j])) {
                    esta = false;
                    continue;
                }
            }
            if (esta)
                result++;
            esta = true;

        }

        return result;
    }
}
