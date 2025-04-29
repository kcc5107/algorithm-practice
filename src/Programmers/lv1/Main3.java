package Programmers.lv1;
//  약수의 합
public class Main3 {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<n/2+1; i++) {
            if (n%i == 0) {
                answer += i;
            }
        }
        answer += n;
        return answer;
    }
}
