package Programmers.lv1;
// 음양 더하기
public class Main16 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
        }
        return answer;
    }
}
