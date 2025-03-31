package problemas;

import java.util.ArrayList;
import java.util.List;

public class Solution2942 {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet","code"}, 'e'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer> list = new ArrayList<>();

        for (String word : words) {
            if (word.contains(x)){

            }
        }

        return list;
    }
}
