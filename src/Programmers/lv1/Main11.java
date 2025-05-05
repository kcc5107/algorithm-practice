package Programmers.lv1;
// 하샤드 수
public class Main11 {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        answer = (x % sum == 0);
        return answer;
    }
}
