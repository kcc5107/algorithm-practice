package Programmers.lv1;

// 가운데 글자 가져오기
public class Main20 {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(s);

        if (s.length() % 2 == 0) {
            answer = sb.substring(sb.length() / 2 - 1, sb.length() / 2 + 1);
        } else {
            answer = sb.substring(sb.length() / 2, sb.length() / 2 + 1);
        }

        return answer;
    }
}
