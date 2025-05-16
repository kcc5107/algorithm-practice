package Programmers.lv2;

import java.util.stream.IntStream;

// 약수의 개수와 덧셈
public class Main3 {
    public int solution(int left, int right) {
        int answer = 0;
        answer = IntStream.range(left, right + 1).map(i -> signByDivisorCount(i)).sum();

        return answer;
    }

    public int signByDivisorCount(int number) {
        int count = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return number * ((count % 2 == 1) ? -1 : 1);
    }
}
