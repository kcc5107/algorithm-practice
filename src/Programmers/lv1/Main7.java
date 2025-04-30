package Programmers.lv1;
// 자연수 뒤집어 배열로 만들기
public class Main7 {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        int i = 0;
        while (n != 0) {
            answer[i] = (int) (n%10);
            n /= 10;
            i++;
        }
        return answer;
    }
}
