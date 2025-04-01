package problemas;

public class Solution3498 {
    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
    }

    public static int reverseDegree(String s) {

        int result = 0;

        String[] array = s.split("");
        for (int i = 0; i < array.length; i++) {
            int x = array[i].charAt(0) - 'a' + 1;
            int reverso = 26 - x + 1;
            result += (reverso * (i + 1));
        }


        return result;

    }
}
