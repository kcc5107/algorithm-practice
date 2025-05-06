package Programmers.lv1;
// 두 정수 사이의 합
public class Main12 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a == b) {
            return a;
        }
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }
//        answer = (long) (min + max) * (max - min + 1) / 2;
        return answer;
    }
}
