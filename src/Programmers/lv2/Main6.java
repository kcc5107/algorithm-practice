package Programmers.lv2;

// 문자열 다루기 기본
public class Main6 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }

        return answer;

        //정규식(regex)를 이용한 방법
//        return s.matches("\\d{4}|\\d{6}");
    }
}
