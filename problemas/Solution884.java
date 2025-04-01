package problemas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution884 {
    public static void main(String[] args) {
        System.out.println(uncommonFromSentences("this apple is sweet", "this apple is sour"));

        for (String s : uncommonFromSentences("this apple is sweet", "this apple is sour")) {
            System.out.println(s);
        }
    }

    public static String[] uncommonFromSentences(String s1, String s2) {

        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");

        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : array1) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        for (String palabra : array2) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        List<String> lista = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            if (entry.getValue() == 1) { // Solo añadimos las palabras que aparecen una vez en total
                lista.add(entry.getKey());
            }
        }

        for (Integer x : contador.values()) {
            System.out.println(x);
        }


        return lista.toArray(new String[0]);

    }
}
