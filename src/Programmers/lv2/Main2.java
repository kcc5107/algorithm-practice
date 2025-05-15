package Programmers.lv2;

// 내적 구하기
public class Main2 {
    public long solution(int[] a, int[] b) {
        long answer = 0L;
        for (int i = 0; i < a.length; i++) {
            answer += (long) a[i] * b[i];
        }

        return answer;
    }
}
