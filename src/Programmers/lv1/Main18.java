package Programmers.lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

// 없는 숫자 더하기
public class Main18 {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        int sumOfDigits = 45;

        for (int number : numbers) {
            sum += number;
        }

        answer = sumOfDigits - sum;
        return answer;

//        return IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
    }
}
