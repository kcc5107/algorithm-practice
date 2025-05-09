package Programmers.lv1;

import java.util.ArrayList;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class Main15 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();

        for (int element : arr) {
            if (element % divisor == 0) {
                answerList.add(element);
            }
        }

        if (answerList.isEmpty()) {
            return new int[]{-1};
        }

        answer = answerList.stream().sorted().mapToInt(Integer::valueOf).toArray();
        return answer;

//        int[] result = Arrays.stream(arr).filter(n -> n % divisor == 0).sorted().toArray();
    }
}
