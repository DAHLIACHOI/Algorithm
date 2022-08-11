package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Leader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String line = input.next();
        String[] vote = line.split("");
        HashMap map = new HashMap();


        for (int j = 0; j < N; j++) {
            if (map.containsKey(vote[j])) {
                Integer value = (Integer) map.get(vote[j]);
                map.put(vote[j], (int)(value.intValue() + 1));
            } else {
                map.put(vote[j], 1);
            }
        }

        int max = 0;
        String answer = "";

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = ((Integer)entry.getValue()).intValue();
            if (max < value) {
                answer = (String)entry.getKey();
                max = value;
            }
        }

        System.out.println(answer.toString());
    }
}
