package problemas;

public class Solution1108 {
    public static void main(String[] args) {
        
        System.out.println(defangIPaddr("1.1.1.1"));

    }

    public static String defangIPaddr(String address) {
        
        StringBuilder result = new StringBuilder();

        result.append(address.replaceAll("\\.", "[.]"));

        return result.toString();
    }
}
