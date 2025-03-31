package problemas;

public class Solution3280 {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
    }

    public static String convertDateToBinary(String date) {

        StringBuilder result = new StringBuilder();

        String[] array = date.split("-");

        for (int i = 0; i < array.length; i++) {
            Integer x = Integer.parseInt(array[i]);
            if (i < array.length - 1)
                result.append(Integer.toBinaryString(x)).append("-");
            else
                result.append(Integer.toBinaryString(x));
        }
        return result.toString();
    }
}
