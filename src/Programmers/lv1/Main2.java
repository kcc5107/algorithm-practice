package Programmers.lv1;

public class Main2 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        answer /= numbers.length;
        return answer;
    }
}
