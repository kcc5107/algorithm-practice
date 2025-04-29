package Programmers.lv1;
// 나머지가 1이 되는 수 찾기
public class Main5 {
    public int solution(int n) {
        int answer = 0;
        for (int i=2; i<=(n-1)/2; i++) {
            if (n%i == 1) {
                answer = i;
                break;
            }
        }
        if (answer == 0) {
            answer = n-1;
        }
        return answer;
    }
}
