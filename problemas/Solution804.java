package problemas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution804 {
    public static void main(String[] args) {
        String[] array = { "gin", "zen", "gig", "msg" };
        uniqueMorseRepresentations(array);
        System.out.println(uniqueMorseRepresentations(array));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Map<String, String> morse = new HashMap<>();

        morse.put("a", ".-");
        morse.put("b", "-...");
        morse.put("c", "-.-.");
        morse.put("d", "-..");
        morse.put("e", ".");
        morse.put("f", "..-.");
        morse.put("g", "--.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j", ".---");
        morse.put("k", "-.-");
        morse.put("l", ".-..");
        morse.put("m", "--");
        morse.put("n", "-.");
        morse.put("o", "---");
        morse.put("p", ".--.");
        morse.put("q", "--.-");
        morse.put("r", ".-.");
        morse.put("s", "...");
        morse.put("t", "-");
        morse.put("u", "..-");
        morse.put("v", "...-");
        morse.put("w", ".--");
        morse.put("x", "-..-");
        morse.put("y", "-.--");
        morse.put("z", "--..");

        Set<String> uniqueMorseWords = new HashSet<>();
        String resultado = "";

        for (String palabra : words) {
            for (int i = 0; i < palabra.length(); i++) {
                String letra = palabra.substring(i,i+1);
                resultado += morse.get(letra);
            }

            uniqueMorseWords.add(resultado);
            resultado = "";
        }



        return uniqueMorseWords.size();

    }
}
