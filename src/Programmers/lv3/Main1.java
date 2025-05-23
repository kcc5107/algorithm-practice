package Programmers.lv3;

import java.util.Arrays;

// 이상한 문자 만들기
public class Main1 {
    public static String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            char[] charArray = strArr[i].toCharArray();

            if (i > 0) {
                sb.append(" ");
            }

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    charArray[j] = Character.toUpperCase(charArray[j]);
                } else {
                    charArray[j] = Character.toLowerCase(charArray[j]);
                }
            }
            sb.append(charArray);
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        String str = "  sadsk  ds  ";
        String[] s = str.split(" ", -1);
        System.out.println(s.length);
        System.out.println(Arrays.toString(s));
        System.out.println(solution(str));
    }
}
