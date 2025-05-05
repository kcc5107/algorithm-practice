package Programmers.lv1;

// 정수 제곱근 판별
public class Main9 {
    public long solution(long n) {
        long answer = -1;
        if (n == 1) {
            return 4;
        }
        for (long i = 2; i <= n / 2; i++) {
            if (i * i == n) {
                return (i + 1) * (i + 1);
            }
        }
        return answer;
    }
}
