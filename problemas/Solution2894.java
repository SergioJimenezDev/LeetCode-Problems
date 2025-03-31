package problemas;

public class Solution2894 {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
    }

    public static int differenceOfSums(int n, int m) {

        Integer num1 = 0; // Not divisible
        Integer num2 = 0; // Divisible

        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            } else {
                num2 += i;
            }
        }

        return num1 - num2;
    }
}
