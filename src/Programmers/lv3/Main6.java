package Programmers.lv3;

// 숫자 문자열과 영단어
public class Main6 {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
