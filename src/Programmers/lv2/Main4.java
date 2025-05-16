package Programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내림차순으로 배치하기
public class Main4 {
    public String solution(String s) {
        String answer = "";
        String[] array = s.chars().boxed().sorted(Comparator.reverseOrder()).map(i -> String.valueOf((char) i.intValue())).toArray(String[]::new);

        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str);
        }

        answer = sb.toString();
        return answer;


//        char[] charArray = s.toCharArray();
//        Arrays.sort(charArray);
//        StringBuilder sb = new StringBuilder();
//        answer = sb.reverse().toString();
//        return answer;
    }
}
