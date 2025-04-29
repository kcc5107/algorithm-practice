package Programmers.lv1;
// 자릿수 더하기
public class Main4 {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);

        for (int i=0; i<num.length(); i++) {
            int i1 = Integer.parseInt(String.valueOf(num.charAt(i)));
            answer += i1;
        }
        return answer;
    }
}
