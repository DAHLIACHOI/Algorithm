import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> keys = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String wordStr = br.readLine();
            String[] words = wordStr.split(" ");
            boolean flag = false;
            String answer = "";

            // 있는지 확인.
            for(int j = 0; j < words.length; j++) {
                char word = Character.toUpperCase(words[j].charAt(0));
                if(keys.contains(word) || flag) {
                    answer = answer + words[j] + " ";
                } else if(!flag && !keys.contains(word)){
                    keys.add(word);
                    flag = true;
                    answer = answer + "[" + words[j].charAt(0) + "]" + words[j].substring(1) + " ";
                }
            }

            // 만약 flag가 여전히 거짓이라면. 처음부터 탐색
            if(!flag) {
                answer = "";
                for(char x : wordStr.toCharArray()) {
                    if(x ==' ') {
                        answer += x;
                        continue;
                    }
                    char word = Character.toUpperCase(x);
                    if(!keys.contains(word) && !flag) {
                        keys.add(word);
                        flag = true;
                        answer = answer + "[" + x + "]";
                    } else {
                        answer += x;
                    }
                }
            }
            bw.write(answer.trim());
            if (i != N - 1) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
