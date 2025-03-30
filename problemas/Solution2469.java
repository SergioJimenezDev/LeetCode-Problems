package problemas;

public class Solution2469 {
    public static void main(String[] args) {
        
        convertTemperature(23.60); //temperatura en celsius
    }

    public static double[] convertTemperature(double celsius) {
        
        double[] ans = new double[2];

        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;

        return ans;
    }
}
