package problemas;

import java.util.ArrayList;
import java.util.List;

public class Solution884 {
    public static void main(String[] args) {
        System.out.println(uncommonFromSentences("apple apple", "banana"));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {

        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");
        List<String> lista = new ArrayList<>();
        Boolean encontrado = false;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    encontrado = true;
                } else if (!array1[i].equals(array2[j]) && !s1.contains(array2[j])) {
                    if (!lista.contains(array2[j]))
                        lista.add(array2[j]);
                }

            }
            if (!encontrado) {
                lista.add(array1[i]);

            }
            encontrado = false;

        }

        int counter = 0;

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))){
                    counter++;
                }
                if (counter > 1){
                    lista.remove(lista.get(i));
                }
            }
            counter = 0;
        }

        String[] result = new String[lista.size()];

        for (String string : lista) {
            System.out.println(string);
        }

        for (int i = 0; i < lista.size(); i++) {
            result[i] = lista.get(i);
        }



        return result;

    }
}
