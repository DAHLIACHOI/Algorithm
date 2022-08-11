package hashMap;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Anagram T = new Anagram();
        Scanner input = new Scanner(System.in);

        String[] words1 = input.next().split("");
        String[] words2 = input.next().split("");


        System.out.println(T.anagramSolution(words1, words2));
    }

    public String anagramSolution(String[] s1, String[] s2) {
        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();


        for (int i = 0; i < s1.length; i++) {
            if (map1.containsKey(s1[i])) {
                Integer value = (Integer) map1.get(s1[i]);
                map1.put(s1[i], (int)(value.intValue() + 1));
            } else {
                map1.put(s1[i], 1);
            }
        }

        for (int i = 0; i < s2.length; i++) {
            if (map2.containsKey(s2[i])) {
                Integer value = (Integer) map2.get(s2[i]);
                map2.put(s2[i], (int) (value.intValue() + 1));
            } else {
                map2.put(s2[i], 1);
            }
        }


        Iterator it = map1.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            if (map2.containsKey(key)) {
                int value = ((Integer)entry.getValue()).intValue();
                if (value != (int) map2.get(key)) {
                    return "NO";
                }
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
