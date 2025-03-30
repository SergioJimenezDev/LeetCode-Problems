package problemas;

public class Solution3110 {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }

    public static int scoreOfString(String s) {

        Integer total = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            total += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }

        return total;
    }
}
