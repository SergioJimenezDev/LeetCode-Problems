package problemas;

import java.util.ArrayList;
import java.util.List;

public class Solution2942 {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet","code"}, 'e'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if (words[i].contains(String.valueOf(x))){
                list.add(i);
            }
        }

        return list;
    }
}
