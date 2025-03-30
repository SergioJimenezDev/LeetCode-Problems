package problemas;

public class Solution2011 {
    public static void main(String[] args) {

        System.out.println(finalValueAfterOperations(new String[] { "--X", "X++", "X++" }));
    }

    public static int finalValueAfterOperations(String[] operations) {

        int result = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                result--;
            } else {
                result++;
            }
        }

        return result;
    }
}
