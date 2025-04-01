package problemas;

public class Solution2413 {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }

    public static int smallestEvenMultiple(int n) {

        Boolean finded = false;
        int number = 0;

        for (int i = 0; i < 10000; i++) {
            if (finded)
                break;
            if (i != 0) {
                if (i % n == 0 && i % 2 == 0) {
                    number = i;
                    finded = true;
                }
            }
        }
        
        return number;
    }
}
